package com.training.authentication.authorization.ldap;

import static org.springframework.security.config.Customizer.withDefaults;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ldap.core.support.BaseLdapPathContextSource;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.ldap.EmbeddedLdapServerContextSourceFactoryBean;
import org.springframework.security.config.ldap.LdapBindAuthenticationManagerFactory;
import org.springframework.security.ldap.userdetails.PersonContextMapper;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfiguration {

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests((authz) -> authz.anyRequest().authenticated()).formLogin();
		return http.build();
	}

	@Bean
	public EmbeddedLdapServerContextSourceFactoryBean contextSourceFactoryBean() {
		EmbeddedLdapServerContextSourceFactoryBean contextSourceFactoryBean = EmbeddedLdapServerContextSourceFactoryBean
				.fromEmbeddedLdapServer();
		contextSourceFactoryBean.setPort(0);
		return contextSourceFactoryBean;
	}

	@Bean
	AuthenticationManager ldapAuthenticationManager(BaseLdapPathContextSource contextSource) {
		LdapBindAuthenticationManagerFactory factory = new LdapBindAuthenticationManagerFactory(contextSource);
		factory.setUserDnPatterns("uid={0},ou=people");
		factory.setUserDetailsContextMapper(new PersonContextMapper());
		return factory.createAuthenticationManager();
	}

}