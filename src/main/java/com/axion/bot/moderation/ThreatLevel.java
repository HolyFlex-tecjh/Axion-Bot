package com.axion.bot.moderation;

/**
 * Enum representing different threat levels
 */
public enum ThreatLevel {
    NONE(0, "No Threat", "🟢"),
    LOW(1, "Low Threat", "🟡"),
    MEDIUM(2, "Medium Threat", "🟠"),
    HIGH(3, "High Threat", "🔴"),
    VERY_HIGH(4, "Very High Threat", "⚫");
    
    private final int level;
    private final String description;
    private final String emoji;
    
    ThreatLevel(int level, String description, String emoji) {
        this.level = level;
        this.description = description;
        this.emoji = emoji;
    }
    
    public int getLevel() {
        return level;
    }
    
    public String getDescription() {
        return description;
    }
    
    public String getEmoji() {
        return emoji;
    }
    
    @Override
    public String toString() {
        return emoji + " " + description;
    }
}