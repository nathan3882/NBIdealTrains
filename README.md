# IdealTrains
Ideal Trains, developed in the NetBeans IDE (NB) is a SOAP web service client that consumes the South Western Railway public endpoints to fetch optimal trains a user could catch in order to depart from station 'A' and arrive at station 'B' at 'C' time with 'D' minutes to spare until time 'E'

# Usages
- Allows people to develop programs which allow users to schedule their journeys according to walk speeds, disabilities or whether they just like a nice coffee in the morning..
- I've utilised this ws consumption to display when a user needs to catch a train in order to get to their lesson on time, with sufficient walking time to get from the station to the actual class room.
# How to:
- Access IdealTrains.getHomeToLessonServices statically.
-    * @param startCrs where the users home station is
     * @param toCrs to this college / work station
     * @param fromWhen current time of request
     * @param walkTimeSeconds if fifteen, get services that arrive 15 mins
     * before lesson time
     * @param lessonTime when your lesson time is
     * @return valid services
# Service.java
- Service.java is the fundamental consumption of the web service, allowing you to fully represent a fetched train service.
- The Service.ServiceType enumeration allows developer to infer whether the Service#get(Sta/Std) is either:
  - ServiceType.ARRIVING_TO_END shows that scheduled time of arrival is to the 'toCrs' CRS code.
  - ServiceType.DEPARTING_FROM_HOME shows that scheduled time of departure is from the 'startCrs' CRS code.
  - ServiceType.HALF_AND_HALF shows that departure functions are from the 'startCrs' CRS and the arrival functions are to the 'toCrs' CRS code.
  
