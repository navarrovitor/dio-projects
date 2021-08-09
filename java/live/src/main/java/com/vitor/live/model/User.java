package com.vitor.live.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.ManyToOne;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class User {
  private Long id;
  private String name;
  private BigDecimal tolerance;
  private LocalDateTime workDayBeg;
  private LocalDateTime workDayEnd;

  // foreign key that connects to Company
  @ManyToOne
  private Company company;

  // foreign key that connects to User Category
  @ManyToOne
  private UserCategory userCategory;

  // foreign key that connects to Access level
  @ManyToOne
  private AccessLevel accessLevel;

  // foreign key that connects to Working Day
  @ManyToOne
  private WorkingDay workingDay;
}