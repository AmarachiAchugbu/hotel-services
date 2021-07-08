package com.example.hotelservices.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name = "hotels")
@EntityListeners(AuditingEntityListener.class)
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "my_sequence")
    @Column(name = "hotel_room_Id", nullable = false)
    private long hotelRoomId;

    @Column(name = "number_of_stars", nullable = false)
    private byte noOfStars;

    @Column(name = "number_of_rooms", nullable = false)
    private int totalNumberOfRooms;

    @Column(name = "room_types", nullable = false)
    private String[] roomTypes;

    @Column(name = "num_of_reserved_rooms", nullable = false)
    private int numberOfReservedRooms;

    @Column(name = "num_of_available_rooms", nullable = false)
    private int numberOfAvailableRooms;

    public byte getNoOfStars() {
        return noOfStars;
    }

    public void setNoOfStars(byte noOfStars) {
        this.noOfStars = noOfStars;
    }

    public int getTotalNumberOfRooms() {
        return totalNumberOfRooms;
    }

    public void setTotalNumberOfRooms(int totalNumberOfRooms) {
        this.totalNumberOfRooms = totalNumberOfRooms;
    }

    public String[] getRoomTypes() {
        return roomTypes;
    }

    public void setRoomTypes(String[] roomTypes) {
        this.roomTypes = roomTypes;
    }

    public int getNumberOfReservedRooms() {
        return numberOfReservedRooms;
    }

    public void setNumberOfReservedRooms(int numberOfReservedRooms) {
        this.numberOfReservedRooms = numberOfReservedRooms;
    }

    public int getNumberOfAvailableRooms() {
        return numberOfAvailableRooms;
    }

    public void setNumberOfAvailableRooms(int numberOfAvailableRooms) {
        this.numberOfAvailableRooms = numberOfAvailableRooms;
    }
}
