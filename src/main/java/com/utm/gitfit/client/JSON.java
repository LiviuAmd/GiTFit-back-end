/*
 * Salt Edge Payment Initiation API
 * API Reference for services
 *
 * OpenAPI spec version: 1.0.0
 * Contact: support@saltedge.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.utm.gitfit.client;

import com.google.gson.*;
import com.google.gson.internal.bind.util.ISO8601Utils;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.utm.gitfit.client.model.*;
import io.gsonfire.GsonFireBuilder;
import io.gsonfire.PostProcessor;
import io.gsonfire.TypeSelector;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.format.DateTimeFormatter;

import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class JSON {
    private Gson gson;
    private boolean isLenientOnJson = false;
    private DateTypeAdapter dateTypeAdapter = new DateTypeAdapter();
    private SqlDateTypeAdapter sqlDateTypeAdapter = new SqlDateTypeAdapter();
    private OffsetDateTimeTypeAdapter offsetDateTimeTypeAdapter = new OffsetDateTimeTypeAdapter();
    private LocalDateTypeAdapter localDateTypeAdapter = new LocalDateTypeAdapter();

    public static GsonBuilder createGson() {
        GsonFireBuilder fireBuilder = new GsonFireBuilder()
          .registerTypeSelector(CommonPaymentAttributes.class, new TypeSelector<CommonPaymentAttributes>() {
            @Override
            public Class<? extends CommonPaymentAttributes> getClassForElement(JsonElement readElement) {
                Map<String, Class<? extends CommonPaymentAttributes>> classByDiscriminatorValue = new HashMap<>();
                    classByDiscriminatorValue.put("BACSPaymentAttributes".toUpperCase(), BACSPaymentAttributes.class);
                    classByDiscriminatorValue.put("BlueCashPaymentAttributes".toUpperCase(), BlueCashPaymentAttributes.class);
                    classByDiscriminatorValue.put("CHAPSPaymentAttributes".toUpperCase(), CHAPSPaymentAttributes.class);
                    classByDiscriminatorValue.put("DOMESTICPaymentAttributes".toUpperCase(), DOMESTICPaymentAttributes.class);
                    classByDiscriminatorValue.put("ELIXIRPaymentAttributes".toUpperCase(), ELIXIRPaymentAttributes.class);
                    classByDiscriminatorValue.put("FasterPaymentAttributes".toUpperCase(), FasterPaymentAttributes.class);
                    classByDiscriminatorValue.put("HSVPPaymentAttributes".toUpperCase(), HSVPPaymentAttributes.class);
                    classByDiscriminatorValue.put("MastercardPaymentAttributes".toUpperCase(), MastercardPaymentAttributes.class);
                    classByDiscriminatorValue.put("SEPAInstantPaymentAttributes".toUpperCase(), SEPAInstantPaymentAttributes.class);
                    classByDiscriminatorValue.put("SEPAPaymentAttributes".toUpperCase(), SEPAPaymentAttributes.class);
                    classByDiscriminatorValue.put("SWIFTPaymentAttributes".toUpperCase(), SWIFTPaymentAttributes.class);
                    classByDiscriminatorValue.put("SorbnetPaymentAttributes".toUpperCase(), SorbnetPaymentAttributes.class);
                    classByDiscriminatorValue.put("Target2PaymentAttributes".toUpperCase(), Target2PaymentAttributes.class);
                    classByDiscriminatorValue.put("VisaPaymentAttributes".toUpperCase(), VisaPaymentAttributes.class);
                    classByDiscriminatorValue.put("CommonPaymentAttributes".toUpperCase(), CommonPaymentAttributes.class);
                return getClassByDiscriminator(
                            classByDiscriminatorValue,
                            getDiscriminatorValue(readElement, ""));
            }
          })
          .registerPostProcessor(CommonPaymentAttributes.class, new PostProcessor<CommonPaymentAttributes>() {
              @Override
              public void postDeserialize(CommonPaymentAttributes result, JsonElement src, Gson gson) {

              }

              @Override
              public void postSerialize(JsonElement result, CommonPaymentAttributes src, Gson gson) {
                  Map<Class<? extends CommonPaymentAttributes>, String> discriminatorValueByClass = new HashMap<>();
                      discriminatorValueByClass.put(BACSPaymentAttributes.class, "BACSPaymentAttributes");
                      discriminatorValueByClass.put(BlueCashPaymentAttributes.class, "BlueCashPaymentAttributes");
                      discriminatorValueByClass.put(CHAPSPaymentAttributes.class, "CHAPSPaymentAttributes");
                      discriminatorValueByClass.put(DOMESTICPaymentAttributes.class, "DOMESTICPaymentAttributes");
                      discriminatorValueByClass.put(ELIXIRPaymentAttributes.class, "ELIXIRPaymentAttributes");
                      discriminatorValueByClass.put(FasterPaymentAttributes.class, "FasterPaymentAttributes");
                      discriminatorValueByClass.put(HSVPPaymentAttributes.class, "HSVPPaymentAttributes");
                      discriminatorValueByClass.put(MastercardPaymentAttributes.class, "MastercardPaymentAttributes");
                      discriminatorValueByClass.put(SEPAInstantPaymentAttributes.class, "SEPAInstantPaymentAttributes");
                      discriminatorValueByClass.put(SEPAPaymentAttributes.class, "SEPAPaymentAttributes");
                      discriminatorValueByClass.put(SWIFTPaymentAttributes.class, "SWIFTPaymentAttributes");
                      discriminatorValueByClass.put(SorbnetPaymentAttributes.class, "SorbnetPaymentAttributes");
                      discriminatorValueByClass.put(Target2PaymentAttributes.class, "Target2PaymentAttributes");
                      discriminatorValueByClass.put(VisaPaymentAttributes.class, "VisaPaymentAttributes");
                      discriminatorValueByClass.put(CommonPaymentAttributes.class, "CommonPaymentAttributes");
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
