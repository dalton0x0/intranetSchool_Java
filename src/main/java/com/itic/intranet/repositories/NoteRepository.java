package com.itic.intranet.repositories;

import com.itic.intranet.models.mysql.Note;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NoteRepository extends JpaRepository<Note, Long> {
    List<Note> findByEvaluationId(Long evaluationId);
    List<Note> findByStudentId(Long studentId);
}
