package com.fdmgroup.DTO.Leave;

import java.sql.Timestamp;
import java.util.UUID;

import com.fdmgroup.DTO.PublicUserDTO;
import com.fdmgroup.DTO.PublicUserDTO.PublicUserDTOBuilder;
import com.fdmgroup.Enum.Status;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LeaveRequestDTO {
	private UUID id;
	private PublicUserDTO sender;
	private Timestamp startDate;
	private Timestamp endDate;
	private Status status;
}

