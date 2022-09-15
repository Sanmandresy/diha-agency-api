/*
 * diha-agency-api
 * An early version of an API for a travel Agency named \"Diha Agency\".
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.LocalDate;
/**
 * Room
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-09-15T20:17:02.734Z[GMT]")
public class Room {
  @SerializedName("room_id")
  private Integer roomId = null;

  @SerializedName("hotel")
  private AllOfRoomHotel hotel = null;

  @SerializedName("client")
  private AllOfRoomClient client = null;

  @SerializedName("price")
  private Integer price = null;

  @SerializedName("ref")
  private String ref = null;

  @SerializedName("room_type")
  private String roomType = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("startingDateBooking")
  private LocalDate startingDateBooking = null;

  @SerializedName("endingDateBooking")
  private LocalDate endingDateBooking = null;

  public Room roomId(Integer roomId) {
    this.roomId = roomId;
    return this;
  }

   /**
   * Get roomId
   * @return roomId
  **/
  @Schema(example = "56", description = "")
  public Integer getRoomId() {
    return roomId;
  }

  public void setRoomId(Integer roomId) {
    this.roomId = roomId;
  }

  public Room hotel(AllOfRoomHotel hotel) {
    this.hotel = hotel;
    return this;
  }

   /**
   * Get hotel
   * @return hotel
  **/
  @Schema(description = "")
  public AllOfRoomHotel getHotel() {
    return hotel;
  }

  public void setHotel(AllOfRoomHotel hotel) {
    this.hotel = hotel;
  }

  public Room client(AllOfRoomClient client) {
    this.client = client;
    return this;
  }

   /**
   * Get client
   * @return client
  **/
  @Schema(description = "")
  public AllOfRoomClient getClient() {
    return client;
  }

  public void setClient(AllOfRoomClient client) {
    this.client = client;
  }

  public Room price(Integer price) {
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @Schema(description = "")
  public Integer getPrice() {
    return price;
  }

  public void setPrice(Integer price) {
    this.price = price;
  }

  public Room ref(String ref) {
    this.ref = ref;
    return this;
  }

   /**
   * Get ref
   * @return ref
  **/
  @Schema(example = "Venus", description = "")
  public String getRef() {
    return ref;
  }

  public void setRef(String ref) {
    this.ref = ref;
  }

  public Room roomType(String roomType) {
    this.roomType = roomType;
    return this;
  }

   /**
   * Get roomType
   * @return roomType
  **/
  @Schema(example = "double", description = "")
  public String getRoomType() {
    return roomType;
  }

  public void setRoomType(String roomType) {
    this.roomType = roomType;
  }

  public Room status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(example = "occupied", description = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Room startingDateBooking(LocalDate startingDateBooking) {
    this.startingDateBooking = startingDateBooking;
    return this;
  }

   /**
   * Get startingDateBooking
   * @return startingDateBooking
  **/
  @Schema(description = "")
  public LocalDate getStartingDateBooking() {
    return startingDateBooking;
  }

  public void setStartingDateBooking(LocalDate startingDateBooking) {
    this.startingDateBooking = startingDateBooking;
  }

  public Room endingDateBooking(LocalDate endingDateBooking) {
    this.endingDateBooking = endingDateBooking;
    return this;
  }

   /**
   * Get endingDateBooking
   * @return endingDateBooking
  **/
  @Schema(description = "")
  public LocalDate getEndingDateBooking() {
    return endingDateBooking;
  }

  public void setEndingDateBooking(LocalDate endingDateBooking) {
    this.endingDateBooking = endingDateBooking;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Room room = (Room) o;
    return Objects.equals(this.roomId, room.roomId) &&
        Objects.equals(this.hotel, room.hotel) &&
        Objects.equals(this.client, room.client) &&
        Objects.equals(this.price, room.price) &&
        Objects.equals(this.ref, room.ref) &&
        Objects.equals(this.roomType, room.roomType) &&
        Objects.equals(this.status, room.status) &&
        Objects.equals(this.startingDateBooking, room.startingDateBooking) &&
        Objects.equals(this.endingDateBooking, room.endingDateBooking);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roomId, hotel, client, price, ref, roomType, status, startingDateBooking, endingDateBooking);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Room {\n");
    
    sb.append("    roomId: ").append(toIndentedString(roomId)).append("\n");
    sb.append("    hotel: ").append(toIndentedString(hotel)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
    sb.append("    roomType: ").append(toIndentedString(roomType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    startingDateBooking: ").append(toIndentedString(startingDateBooking)).append("\n");
    sb.append("    endingDateBooking: ").append(toIndentedString(endingDateBooking)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}