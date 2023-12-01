package com.example.demo;
/**
 * The 'Team' class represents a team in the application, storing information such as team name, type, leader, and a list of team members.
 */
public class Team {
    private String teamName;
    private String type;
    private String leader;
    private String memberList;
    /**
     * Returns a string representation of the team in the format: "teamName, type, leader, memberList".
     */
    public String toString() {
        return teamName + "," + type + "," + leader + "," + memberList ;
    }
    /**
     * non-para constructor for the Team class.
     */
    public Team() {
    }
    /**
     * Parameterized constructor for creating a Team with specified details.
     *
     * @param teamName   The name of the team.
     * @param type       The type or category of the team.
     * @param leader     The name of the team leader.
     * @param memberList A string representation of the team's member list.
     */
    public Team(String teamName, String type, String leader, String memberList) {
        this.teamName = teamName;
        this.type = type;
        this.leader = leader;
        this.memberList = memberList;
    }
    /**
     * Gets the name of the team.
     *
     * @return The team name.
     */
    public String getTeamName() {
        return teamName;
    }
    /**
     * Sets the name of the team.
     *
     * @param teamName The team name to set.
     */
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
    /**
     * Gets the type or category of the team.
     *
     * @return The team type.
     */
    public String getType() {
        return type;
    }
    /**
     * Sets the type or category of the team.
     *
     * @param type The team type to set.
     */
    public void setType(String type) {
        this.type = type;
    }
    /**
     * Gets the name of the team leader.
     *
     * @return The team leader's name.
     */
    public String getLeader() {
        return leader;
    }
    /**
     * Sets the name of the team leader.
     *
     * @param leader The team leader's name to set.
     */
    public void setLeader(String leader) {
        this.leader = leader;
    }
    /**
     * Gets the string representation of the team's member list.
     *
     * @return The team's member list.
     */
    public String getMemberList() {
        return memberList;
    }
    /**
     * Sets the string representation of the team's member list.
     *
     * @param memberList The team's member list to set.
     */
    public void setMemberList(String memberList) {
        this.memberList = memberList;
    }
}
