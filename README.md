coursera-functional-programming-principles-in-scala
===================================================

Submissions for Coursera's Functional Programming in Scala course by Martin Odersky, École Polytechnique Fédérale de Lausanne


# Notes
## SBT Build

Just change the ~/.sbtconfig file so enough RAM is available for the VM

    SBT_OPTS="-Xms512M -Xmx3536M -Xss1M
      -XX:+CMSClassUnloadingEnabled
      -XX:+UseConcMarkSweepGC -XX:MaxPermSize=724M"

