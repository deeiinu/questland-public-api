package com.questland.handbook.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class BattleLocation {
    private int id;

    private String name;

    private List<Stage> stages;
}
