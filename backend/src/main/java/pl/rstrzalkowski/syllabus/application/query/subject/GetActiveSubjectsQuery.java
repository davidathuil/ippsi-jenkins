package pl.rstrzalkowski.syllabus.application.query.subject;


import org.springframework.data.domain.Pageable;

public record GetActiveSubjectsQuery(Pageable pageable) {
}
