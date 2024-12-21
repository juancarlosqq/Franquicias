package co.com.nequi.franchise.domain.model;

import java.util.UUID;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
public class Product {

	private Long id;
	private UUID uniqueId;
	private Branch branch;
	private String name;
	private Long stock;
}
