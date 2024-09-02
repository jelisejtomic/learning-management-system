package lms_security.configuration;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.springframework.core.convert.converter.Converter;
import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;
import org.springframework.security.oauth2.server.resource.authentication.JwtGrantedAuthoritiesConverter;
import org.springframework.stereotype.Component;

@Component
public class JwtConverter implements Converter<Jwt, AbstractAuthenticationToken> {
	JwtGrantedAuthoritiesConverter jwtGrantedAuthoritiesConverter;

	public JwtConverter() {
		this.jwtGrantedAuthoritiesConverter = new JwtGrantedAuthoritiesConverter();
	}

	@Override
	public AbstractAuthenticationToken convert(Jwt source) {
		// FIXME:
		Collection<GrantedAuthority> grantedAuthorities = jwtGrantedAuthoritiesConverter.convert(source);

		Map<String, List<String>> realmRoles = source.getClaim("realm_access");
//		Map<String, List<String>> resourceAccess = source.getClaim("resource_access");
		List<String> roles = realmRoles.get("roles");

		for (String role : roles) {
			grantedAuthorities.add(new SimpleGrantedAuthority(role)); // uloge kreirati ROLE_ULOGA
		}

		return new JwtAuthenticationToken(source, grantedAuthorities);
	}

}
