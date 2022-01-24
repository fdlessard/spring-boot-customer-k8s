package io.fdlessard.codebites.customer.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Table(name = "customer", schema = "public")
@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer  {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  protected Long id;

  @JsonIgnore
  @Version
  @Column(name = "version")
  protected int version;

  @NotBlank(message = "lastName name cannot be blank")
  @Size(min = 2, message = "lastName must have more thant 2 characters")
  private String lastName;

  @NotBlank(message = "firstName name cannot be blank")
  @Size(min = 2, message = "firstName must have more thant 2 characters")
  private String firstName;

  @NotBlank(message = "company name cannot be blank")
  @Size(min = 2, message = "company must have more thant 2 characters")
  private String company;


}
