package com.mfpe.model;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Component
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AuditBenchmark {
	
	private int benchmarkId;
	private String auditType;
	private int benchmarkNoAnswers;
	
}
