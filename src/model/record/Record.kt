package model.record

import java.util.Date


sealed class Record(val subject: String, val content: String, val date: Date) {

}

class AnalysisRecord(subject: String, content: String, date: Date,
                     val severity: Double, val applied: Boolean): Record(subject, content, date) {

}

class HistoryRecord(subject: String, content: String, date: Date,
                    val procedureType: Int): Record(subject, content, date) {

}