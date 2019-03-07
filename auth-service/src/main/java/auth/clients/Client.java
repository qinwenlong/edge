package auth.clients;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.util.StringUtils;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Client {

 @Id
 @GeneratedValue
 private Long id;

 private String clientId;

 private String secret;

 private String scopes = StringUtils
  .arrayToCommaDelimitedString(new String[] { "openid" });

 private String authorizedGrantTypes = StringUtils
  .arrayToCommaDelimitedString(new String[] { "authorization_code",
   "refresh_token", "password" });

 private String authorities = StringUtils
  .arrayToCommaDelimitedString(new String[] { "ROLE_USER", "ROLE_ADMIN" });

 private String autoApproveScopes = StringUtils
  .arrayToCommaDelimitedString(new String[] { ".*" });

 public Client(String clientId, String clientSecret) {
  this.clientId = clientId;
  this.secret = clientSecret;
 }
 

public Client() {
	super();
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getClientId() {
	return clientId;
}

public void setClientId(String clientId) {
	this.clientId = clientId;
}

public String getSecret() {
	return secret;
}

public void setSecret(String secret) {
	this.secret = secret;
}

public String getScopes() {
	return scopes;
}

public void setScopes(String scopes) {
	this.scopes = scopes;
}

public String getAuthorizedGrantTypes() {
	return authorizedGrantTypes;
}

public void setAuthorizedGrantTypes(String authorizedGrantTypes) {
	this.authorizedGrantTypes = authorizedGrantTypes;
}

public String getAuthorities() {
	return authorities;
}

public void setAuthorities(String authorities) {
	this.authorities = authorities;
}

public String getAutoApproveScopes() {
	return autoApproveScopes;
}

public void setAutoApproveScopes(String autoApproveScopes) {
	this.autoApproveScopes = autoApproveScopes;
}


@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((authorities == null) ? 0 : authorities.hashCode());
	result = prime * result + ((authorizedGrantTypes == null) ? 0 : authorizedGrantTypes.hashCode());
	result = prime * result + ((autoApproveScopes == null) ? 0 : autoApproveScopes.hashCode());
	result = prime * result + ((clientId == null) ? 0 : clientId.hashCode());
	result = prime * result + ((id == null) ? 0 : id.hashCode());
	result = prime * result + ((scopes == null) ? 0 : scopes.hashCode());
	result = prime * result + ((secret == null) ? 0 : secret.hashCode());
	return result;
}


@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Client other = (Client) obj;
	if (authorities == null) {
		if (other.authorities != null)
			return false;
	} else if (!authorities.equals(other.authorities))
		return false;
	if (authorizedGrantTypes == null) {
		if (other.authorizedGrantTypes != null)
			return false;
	} else if (!authorizedGrantTypes.equals(other.authorizedGrantTypes))
		return false;
	if (autoApproveScopes == null) {
		if (other.autoApproveScopes != null)
			return false;
	} else if (!autoApproveScopes.equals(other.autoApproveScopes))
		return false;
	if (clientId == null) {
		if (other.clientId != null)
			return false;
	} else if (!clientId.equals(other.clientId))
		return false;
	if (id == null) {
		if (other.id != null)
			return false;
	} else if (!id.equals(other.id))
		return false;
	if (scopes == null) {
		if (other.scopes != null)
			return false;
	} else if (!scopes.equals(other.scopes))
		return false;
	if (secret == null) {
		if (other.secret != null)
			return false;
	} else if (!secret.equals(other.secret))
		return false;
	return true;
}
 
}
