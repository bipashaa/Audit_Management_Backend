package com.mfpe.model;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Component
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AuditRequest {
	
	private String projectName;
	private String managerName;
	private AuditDetail auditDetail;
	
}
