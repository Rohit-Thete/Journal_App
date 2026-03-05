package com.rohit.journalApp1.controller;


import com.rohit.journalApp1.entity.JournalEntry;
import org.bson.types.ObjectId;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class JournalEntryController {
    private Map<ObjectId, JournalEntry> journalEntries = new HashMap<>();

@GetMapping
    public List<JournalEntry> getAll(){
        return new ArrayList<>(journalEntries.values());
    }

    @PostMapping
    public boolean createEntry(@RequestBody JournalEntry myEntry){
       journalEntries.put(myEntry.getId(),myEntry);
        return true;

    }

    @GetMapping("id/{myId}")
    public JournalEntry getJournalEntryById(@PathVariable Long myId){
    return journalEntries.get(myId);
    }

    @DeleteMapping("id/{myId}")
        public JournalEntry deleteJournalEntryById(@PathVariable Long myId)
        {
           return journalEntries.remove(myId);
        }
    }

