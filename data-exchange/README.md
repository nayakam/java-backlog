### Data Exchange

Existing data exchange libraries 

[Google Gson](https://github.com/google/gson)  
[FastJSON](http://www.codeproject.com/Articles/159450/fastJSON)  
[Jackson](https://github.com/FasterXML/jackson)  
[JSPNP](https://jsonp.java.net/) 


#### Jackson Annotations
Jackson is a Java library for handling data exchange and a Java serialization and deserialization API. This supports primarily JSON and also supports other formats such as CSV, Java Properties,XML and YAML etc.   

##### Usage

###### Jackson Mix-In annotation
- Decouple domain object and jason related data exchange model.

###### JsonCreator Annotation
- As default jackson uses empty constructor
- Otherwise @JsonCreator and @JsonProperty annotations to create parametrised constructors
- @JsonCreator can be used similarly static factory method  and with Map parameter

```Java
String yaml = "---\n" +
        "plateNumber: \"ABC-123\"\n" +
        "wheels: \n" +
        " - id: \"100\" \n" +
        "   wheelDescription: \"Test desc\" \n" +
        "id: \"ABC-123\"";
```

```Java
@JsonCreator
public Wheel(@JsonProperty("id") String id, @JsonProperty("wheelDescription") String wheelDescription) {
    this.id = id;
    this.wheelDescription = wheelDescription;
}
```

```Java
 @JsonCreator
 public Wheel(Map<String, Object> delegate) {
      this.id = (String) delegate.get("id");
//     this.wheelDescription = (String) delegate.get("wheelDescription");
 }
 ```
 
##### Reference 
* [JacksonHome](http://wiki.fasterxml.com/JacksonHome)
* [Jackson-Annotations](https://github.com/FasterXML/jackson-annotations/wiki/Jackson-Annotations)
* [JacksonMixInAnnotations](http://wiki.fasterxml.com/JacksonMixInAnnotations)
* [The Ultimate JSON Library: JSON.simple vs GSON vs Jackson vs JSONP](http://blog.takipi.com/the-ultimate-json-library-json-simple-vs-gson-vs-jackson-vs-json/)
* [Benchmark of Java JSON libraries](https://github.com/fabienrenaud/java-json-benchmark)
