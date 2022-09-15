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

package io.swagger.client;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import io.gsonfire.GsonFireBuilder;
import io.gsonfire.PostProcessor;
import io.gsonfire.TypeSelector;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.util.ISO8601Utils;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.format.DateTimeFormatter;

import io.swagger.client.model.*;

import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.Map;
import java.util.HashMap;

public class JSON {
    private Gson gson;
    private boolean isLenientOnJson = false;
    private DateTypeAdapter dateTypeAdapter = new DateTypeAdapter();
    private SqlDateTypeAdapter sqlDateTypeAdapter = new SqlDateTypeAdapter();
    private OffsetDateTimeTypeAdapter offsetDateTimeTypeAdapter = new OffsetDateTimeTypeAdapter();
    private LocalDateTypeAdapter localDateTypeAdapter = new LocalDateTypeAdapter();

    public static GsonBuilder createGson() {
        GsonFireBuilder fireBuilder = new GsonFireBuilder()
          .registerTypeSelector(HotelDetails.class, new TypeSelector<HotelDetails>() {
            @Override
            public Class<? extends HotelDetails> getClassForElement(JsonElement readElement) {
                Map<String, Class<? extends HotelDetails>> classByDiscriminatorValue = new HashMap<>();
                    classByDiscriminatorValue.put("AllOfHotelDetails".toUpperCase(), AllOfHotelDetails.class);
                    classByDiscriminatorValue.put("AllOfPreHotelDetails".toUpperCase(), AllOfPreHotelDetails.class);
                    classByDiscriminatorValue.put("HotelDetails".toUpperCase(), HotelDetails.class);
                return getClassByDiscriminator(
                            classByDiscriminatorValue,
                            getDiscriminatorValue(readElement, ""));
            }
          })
          .registerPostProcessor(HotelDetails.class, new PostProcessor<HotelDetails>() {
              @Override
              public void postDeserialize(HotelDetails result, JsonElement src, Gson gson) {

              }

              @Override
              public void postSerialize(JsonElement result, HotelDetails src, Gson gson) {
                  Map<Class<? extends HotelDetails>, String> discriminatorValueByClass = new HashMap<>();
                      discriminatorValueByClass.put(AllOfHotelDetails.class, "AllOfHotelDetails");
                      discriminatorValueByClass.put(AllOfPreHotelDetails.class, "AllOfPreHotelDetails");
                      discriminatorValueByClass.put(HotelDetails.class, "HotelDetails");
                  if(result instanceof JsonObject)
                  {
                      if(!((JsonObject) result).has(""))
                      {
                          ((JsonObject) result).addProperty("", discriminatorValueByClass.get(src.getClass()));
                      }
                  }
              }
          })
          .registerTypeSelector(Client.class, new TypeSelector<Client>() {
            @Override
            public Class<? extends Client> getClassForElement(JsonElement readElement) {
                Map<String, Class<? extends Client>> classByDiscriminatorValue = new HashMap<>();
                    classByDiscriminatorValue.put("AllOfPreRoomClientDetails".toUpperCase(), AllOfPreRoomClientDetails.class);
                    classByDiscriminatorValue.put("AllOfRoomClientDetails".toUpperCase(), AllOfRoomClientDetails.class);
                    classByDiscriminatorValue.put("Client".toUpperCase(), Client.class);
                return getClassByDiscriminator(
                            classByDiscriminatorValue,
                            getDiscriminatorValue(readElement, ""));
            }
          })
          .registerPostProcessor(Client.class, new PostProcessor<Client>() {
              @Override
              public void postDeserialize(Client result, JsonElement src, Gson gson) {

              }

              @Override
              public void postSerialize(JsonElement result, Client src, Gson gson) {
                  Map<Class<? extends Client>, String> discriminatorValueByClass = new HashMap<>();
                      discriminatorValueByClass.put(AllOfPreRoomClientDetails.class, "AllOfPreRoomClientDetails");
                      discriminatorValueByClass.put(AllOfRoomClientDetails.class, "AllOfRoomClientDetails");
                      discriminatorValueByClass.put(Client.class, "Client");
                  if(result instanceof JsonObject)
                  {
                      if(!((JsonObject) result).has(""))
                      {
                          ((JsonObject) result).addProperty("", discriminatorValueByClass.get(src.getClass()));
                      }
                  }
              }
          })
          .registerTypeSelector(RoomTypes.class, new TypeSelector<RoomTypes>() {
            @Override
            public Class<? extends RoomTypes> getClassForElement(JsonElement readElement) {
                Map<String, Class<? extends RoomTypes>> classByDiscriminatorValue = new HashMap<>();
                    classByDiscriminatorValue.put("AllOfPreRoomRoomType".toUpperCase(), AllOfPreRoomRoomType.class);
                    classByDiscriminatorValue.put("AllOfRoomRoomType".toUpperCase(), AllOfRoomRoomType.class);
                    classByDiscriminatorValue.put("RoomTypes".toUpperCase(), RoomTypes.class);
                return getClassByDiscriminator(
                            classByDiscriminatorValue,
                            getDiscriminatorValue(readElement, ""));
            }
          })
          .registerPostProcessor(RoomTypes.class, new PostProcessor<RoomTypes>() {
              @Override
              public void postDeserialize(RoomTypes result, JsonElement src, Gson gson) {

              }

              @Override
              public void postSerialize(JsonElement result, RoomTypes src, Gson gson) {
                  Map<Class<? extends RoomTypes>, String> discriminatorValueByClass = new HashMap<>();
                      discriminatorValueByClass.put(AllOfPreRoomRoomType.class, "AllOfPreRoomRoomType");
                      discriminatorValueByClass.put(AllOfRoomRoomType.class, "AllOfRoomRoomType");
                      discriminatorValueByClass.put(RoomTypes.class, "RoomTypes");
                  if(result instanceof JsonObject)
                  {
                      if(!((JsonObject) result).has(""))
                      {
                          ((JsonObject) result).addProperty("", discriminatorValueByClass.get(src.getClass()));
                      }
                  }
              }
          })
          .registerTypeSelector(RoomStatus.class, new TypeSelector<RoomStatus>() {
            @Override
            public Class<? extends RoomStatus> getClassForElement(JsonElement readElement) {
                Map<String, Class<? extends RoomStatus>> classByDiscriminatorValue = new HashMap<>();
                    classByDiscriminatorValue.put("AllOfPreRoomStatus".toUpperCase(), AllOfPreRoomStatus.class);
                    classByDiscriminatorValue.put("AllOfRoomStatus".toUpperCase(), AllOfRoomStatus.class);
                    classByDiscriminatorValue.put("RoomStatus".toUpperCase(), RoomStatus.class);
                return getClassByDiscriminator(
                            classByDiscriminatorValue,
                            getDiscriminatorValue(readElement, ""));
            }
          })
          .registerPostProcessor(RoomStatus.class, new PostProcessor<RoomStatus>() {
              @Override
              public void postDeserialize(RoomStatus result, JsonElement src, Gson gson) {

              }

              @Override
              public void postSerialize(JsonElement result, RoomStatus src, Gson gson) {
                  Map<Class<? extends RoomStatus>, String> discriminatorValueByClass = new HashMap<>();
                      discriminatorValueByClass.put(AllOfPreRoomStatus.class, "AllOfPreRoomStatus");
                      discriminatorValueByClass.put(AllOfRoomStatus.class, "AllOfRoomStatus");
                      discriminatorValueByClass.put(RoomStatus.class, "RoomStatus");
                  if(result instanceof JsonObject)
                  {
                      if(!((JsonObject) result).has(""))
                      {
                          ((JsonObject) result).addProperty("", discriminatorValueByClass.get(src.getClass()));
                      }
                  }
              }
          })
          .registerTypeSelector(Exception.class, new TypeSelector<Exception>() {
            @Override
            public Class<? extends Exception> getClassForElement(JsonElement readElement) {
                Map<String, Class<? extends Exception>> classByDiscriminatorValue = new HashMap<>();
                    classByDiscriminatorValue.put("BadRequestException".toUpperCase(), BadRequestException.class);
                    classByDiscriminatorValue.put("InternalServerException".toUpperCase(), InternalServerException.class);
                    classByDiscriminatorValue.put("NotAuthorizedException".toUpperCase(), NotAuthorizedException.class);
                    classByDiscriminatorValue.put("ResourceNotFoundException".toUpperCase(), ResourceNotFoundException.class);
                    classByDiscriminatorValue.put("TooManyRequestsException".toUpperCase(), TooManyRequestsException.class);
                    classByDiscriminatorValue.put("Exception".toUpperCase(), Exception.class);
                return getClassByDiscriminator(
                            classByDiscriminatorValue,
                            getDiscriminatorValue(readElement, ""));
            }
          })
          .registerPostProcessor(Exception.class, new PostProcessor<Exception>() {
              @Override
              public void postDeserialize(Exception result, JsonElement src, Gson gson) {

              }

              @Override
              public void postSerialize(JsonElement result, Exception src, Gson gson) {
                  Map<Class<? extends Exception>, String> discriminatorValueByClass = new HashMap<>();
                      discriminatorValueByClass.put(BadRequestException.class, "BadRequestException");
                      discriminatorValueByClass.put(InternalServerException.class, "InternalServerException");
                      discriminatorValueByClass.put(NotAuthorizedException.class, "NotAuthorizedException");
                      discriminatorValueByClass.put(ResourceNotFoundException.class, "ResourceNotFoundException");
                      discriminatorValueByClass.put(TooManyRequestsException.class, "TooManyRequestsException");
                      discriminatorValueByClass.put(Exception.class, "Exception");
                  if(result instanceof JsonObject)
                  {
                      if(!((JsonObject) result).has(""))
                      {
                          ((JsonObject) result).addProperty("", discriminatorValueByClass.get(src.getClass()));
                      }
                  }
              }
          })
        ;
        return fireBuilder.createGsonBuilder();
    }

    private static String getDiscriminatorValue(JsonElement readElement, String discriminatorField) {
        JsonElement element = readElement.getAsJsonObject().get(discriminatorField);
        if(null == element) {
            throw new IllegalArgumentException("missing discriminator field: <" + discriminatorField + ">");
        }
        return element.getAsString();
    }

    private static <T> Class<? extends T> getClassByDiscriminator(Map<String, Class<? extends T>> classByDiscriminatorValue, String discriminatorValue) {
        Class<? extends T> clazz = classByDiscriminatorValue.get(discriminatorValue.toUpperCase());
        if(null == clazz) {
            throw new IllegalArgumentException("cannot determine model class of name: <" + discriminatorValue + ">");
        }
        return clazz;
    }

    public JSON() {
        gson = createGson()
            .registerTypeAdapter(Date.class, dateTypeAdapter)
            .registerTypeAdapter(java.sql.Date.class, sqlDateTypeAdapter)
            .registerTypeAdapter(OffsetDateTime.class, offsetDateTimeTypeAdapter)
            .registerTypeAdapter(LocalDate.class, localDateTypeAdapter)
            .create();
    }

    /**
     * Get Gson.
     *
     * @return Gson
     */
    public Gson getGson() {
        return gson;
    }

    /**
     * Set Gson.
     *
     * @param gson Gson
     * @return JSON
     */
    public JSON setGson(Gson gson) {
        this.gson = gson;
        return this;
    }

    public JSON setLenientOnJson(boolean lenientOnJson) {
        isLenientOnJson = lenientOnJson;
        return this;
    }

    /**
     * Serialize the given Java object into JSON string.
     *
     * @param obj Object
     * @return String representation of the JSON
     */
    public String serialize(Object obj) {
        return gson.toJson(obj);
    }

    /**
     * Deserialize the given JSON string to Java object.
     *
     * @param <T>        Type
     * @param body       The JSON string
     * @param returnType The type to deserialize into
     * @return The deserialized Java object
     */
    @SuppressWarnings("unchecked")
    public <T> T deserialize(String body, Type returnType) {
        try {
            if (isLenientOnJson) {
                JsonReader jsonReader = new JsonReader(new StringReader(body));
                // see https://google-gson.googlecode.com/svn/trunk/gson/docs/javadocs/com/google/gson/stream/JsonReader.html#setLenient(boolean)
                jsonReader.setLenient(true);
                return gson.fromJson(jsonReader, returnType);
            } else {
                return gson.fromJson(body, returnType);
            }
        } catch (JsonParseException e) {
            // Fallback processing when failed to parse JSON form response body:
            // return the response body string directly for the String return type;
            if (returnType.equals(String.class))
                return (T) body;
            else throw (e);
        }
    }

    /**
     * Gson TypeAdapter for JSR310 OffsetDateTime type
     */
    public static class OffsetDateTimeTypeAdapter extends TypeAdapter<OffsetDateTime> {

        private DateTimeFormatter formatter;

        public OffsetDateTimeTypeAdapter() {
            this(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        }

        public OffsetDateTimeTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, OffsetDateTime date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public OffsetDateTime read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    if (date.endsWith("+0000")) {
                        date = date.substring(0, date.length()-5) + "Z";
                    }
                    return OffsetDateTime.parse(date, formatter);
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 LocalDate type
     */
    public class LocalDateTypeAdapter extends TypeAdapter<LocalDate> {

        private DateTimeFormatter formatter;

        public LocalDateTypeAdapter() {
            this(DateTimeFormatter.ISO_LOCAL_DATE);
        }

        public LocalDateTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, LocalDate date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public LocalDate read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    return LocalDate.parse(date, formatter);
            }
        }
    }

    public JSON setOffsetDateTimeFormat(DateTimeFormatter dateFormat) {
        offsetDateTimeTypeAdapter.setFormat(dateFormat);
        return this;
    }

    public JSON setLocalDateFormat(DateTimeFormatter dateFormat) {
        localDateTypeAdapter.setFormat(dateFormat);
        return this;
    }

    /**
     * Gson TypeAdapter for java.sql.Date type
     * If the dateFormat is null, a simple "yyyy-MM-dd" format will be used
     * (more efficient than SimpleDateFormat).
     */
    public static class SqlDateTypeAdapter extends TypeAdapter<java.sql.Date> {

        private DateFormat dateFormat;

        public SqlDateTypeAdapter() {
        }

        public SqlDateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, java.sql.Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = date.toString();
                }
                out.value(value);
            }
        }

        @Override
        public java.sql.Date read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    try {
                        if (dateFormat != null) {
                            return new java.sql.Date(dateFormat.parse(date).getTime());
                        }
                        return new java.sql.Date(ISO8601Utils.parse(date, new ParsePosition(0)).getTime());
                    } catch (ParseException e) {
                        throw new JsonParseException(e);
                    }
            }
        }
    }

    /**
     * Gson TypeAdapter for java.util.Date type
     * If the dateFormat is null, ISO8601Utils will be used.
     */
    public static class DateTypeAdapter extends TypeAdapter<Date> {

        private DateFormat dateFormat;

        public DateTypeAdapter() {
        }

        public DateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = ISO8601Utils.format(date, true);
                }
                out.value(value);
            }
        }

        @Override
        public Date read(JsonReader in) throws IOException {
            try {
                switch (in.peek()) {
                    case NULL:
                        in.nextNull();
                        return null;
                    default:
                        String date = in.nextString();
                        try {
                            if (dateFormat != null) {
                                return dateFormat.parse(date);
                            }
                            return ISO8601Utils.parse(date, new ParsePosition(0));
                        } catch (ParseException e) {
                            throw new JsonParseException(e);
                        }
                }
            } catch (IllegalArgumentException e) {
                throw new JsonParseException(e);
            }
        }
    }

    public JSON setDateFormat(DateFormat dateFormat) {
        dateTypeAdapter.setFormat(dateFormat);
        return this;
    }

    public JSON setSqlDateFormat(DateFormat dateFormat) {
        sqlDateTypeAdapter.setFormat(dateFormat);
        return this;
    }

}