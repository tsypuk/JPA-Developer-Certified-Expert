package ua.in.smartjava.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PostLoad;
import javax.persistence.Version;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Slf4j
public class EmployeeOptimistic {
    @Id
    @GeneratedValue
    private int id;

    @Version
    private int version;

    private String street;
    private String district;
    private int vacationDays;

    @PostLoad
    public void load() {
        log.info("PostLoad");
    }
}