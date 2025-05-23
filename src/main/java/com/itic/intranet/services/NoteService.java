package com.itic.intranet.services;

import com.itic.intranet.dtos.NoteRequestDto;
import com.itic.intranet.dtos.NoteResponseDto;

import java.util.List;

public interface NoteService {
    List<NoteResponseDto> getAllNotes();
    NoteResponseDto getNoteById(Long id);
    NoteResponseDto addNote(NoteRequestDto noteDto);
    NoteResponseDto updateNote(Long id, NoteRequestDto noteDto);
    void deleteNote(Long id);
}
