// Generated by <a href="http://scalaxb.org/">scalaxb</a>.
package org.iptc.sportsml.v3


/** Soccer-specific metadata for events. | Metadata that is specific to soccer for events.
*/
case class SoccerEventMetadataComplexType(timeAdjustment: Seq[org.iptc.sportsml.v3.SoccerTimeAdjustmentComplexType] = Nil,
  attributes: Map[String, scalaxb.DataRecord[Any]] = Map()) extends EventMetadataComplexTypeOption {
  lazy val kickOffTeamIdref = attributes.get("@kick-off-team-idref") map { _.as[String]}
  lazy val week = attributes.get("@week") map { _.as[String]}
}

      


/** Record time added by referee. | Holds values for the time added by the referee and how much extra time was actually played.
*/
case class SoccerTimeAdjustmentComplexType(attributes: Map[String, scalaxb.DataRecord[Any]] = Map()) extends BaseTimeAdjustmentComplexTypable {
  lazy val id = attributes.get("@id") map { _.as[String]}
  lazy val classValue = attributes.get("@class") map { _.as[String]}
  lazy val style = attributes.get("@style") map { _.as[String]}
  lazy val periodExtraTimeAdded = attributes.get("@period-extra-time-added") map { _.as[String]}
  lazy val periodExtraTimeElapsed = attributes.get("@period-extra-time-elapsed") map { _.as[String]}
}

      


/** Player metadata specific to soccer. | Metadata for one player, specific to soccer.
*/
case class SoccerPlayerMetadataComplexType(attributes: Map[String, scalaxb.DataRecord[Any]] = Map()) extends PlayerMetadataComplexTypeOption {
  lazy val id = attributes.get("@id") map { _.as[String]}
  lazy val classValue = attributes.get("@class") map { _.as[String]}
  lazy val style = attributes.get("@style") map { _.as[String]}
  lazy val lineFormationRow = attributes.get("@line-formation-row") map { _.as[BigInt]}
  lazy val lineFormationPosition = attributes.get("@line-formation-position") map { _.as[BigInt]}
}

      


/** Soccer specific stats for one team. | Team-stats that is specific to  soccer and does not apply to all sports.
*/
case class SoccerTeamStatsComplexType(statsSoccerOffensive: Seq[org.iptc.sportsml.v3.SoccerStatsOffensiveComplexType] = Nil,
  statsSoccerDefensive: Seq[org.iptc.sportsml.v3.SoccerStatsDefensiveComplexType] = Nil,
  statsSoccerFoul: Seq[org.iptc.sportsml.v3.SoccerStatsFoulComplexType] = Nil,
  attributes: Map[String, scalaxb.DataRecord[Any]] = Map()) extends BaseSoccerStatsComplexTypable with TeamStatsComplexTypeOption {
  lazy val id = attributes.get("@id") map { _.as[String]}
  lazy val classValue = attributes.get("@class") map { _.as[String]}
  lazy val style = attributes.get("@style") map { _.as[String]}
  lazy val statsCoverage = attributes.get("@stats-coverage") map { _.as[String]}
  lazy val teamCoverage = attributes.get("@team-coverage") map { _.as[TeamCoverage]}
  lazy val durationScope = attributes.get("@duration-scope") map { _.as[String]}
  lazy val alignmentScope = attributes.get("@alignment-scope") map { _.as[AlignmentScope]}
  lazy val position = attributes.get("@position") map { _.as[String]}
  lazy val recordMakingScope = attributes.get("@record-making-scope") map { _.as[String]}
  lazy val scopingLabel = attributes.get("@scoping-label") map { _.as[String]}
  lazy val periodValue = attributes.get("@period-value") map { _.as[String]}
  lazy val periodType = attributes.get("@period-type") map { _.as[String]}
  lazy val startDateTime = attributes.get("@start-date-time") map { _.as[String]}
  lazy val endDateTime = attributes.get("@end-date-time") map { _.as[String]}
  lazy val periodStartDateTime = attributes.get("@period-start-date-time") map { _.as[String]}
  lazy val periodEndDateTime = attributes.get("@period-end-date-time") map { _.as[String]}
  lazy val temporalUnitType = attributes.get("@temporal-unit-type") map { _.as[String]}
  lazy val temporalUnitValue = attributes.get("@temporal-unit-value") map { _.as[String]}
  lazy val eventSpan = attributes.get("@event-span") map { _.as[BigInt]}
  lazy val opponentValue = attributes.get("@opponent-value") map { _.as[String]}
  lazy val opponentType = attributes.get("@opponent-type") map { _.as[String]}
  lazy val team = attributes.get("@team") map { _.as[String]}
  lazy val competition = attributes.get("@competition") map { _.as[String]}
  lazy val unitValue = attributes.get("@unit-value") map { _.as[String]}
  lazy val unitType = attributes.get("@unit-type") map { _.as[String]}
  lazy val situation = attributes.get("@situation") map { _.as[String]}
  lazy val locationKey = attributes.get("@location-key") map { _.as[String]}
  lazy val venueType = attributes.get("@venue-type") map { _.as[String]}
  lazy val surfaceType = attributes.get("@surface-type") map { _.as[String]}
  lazy val weatherType = attributes.get("@weather-type") map { _.as[String]}
  lazy val scopeValue = attributes.get("@scope-value") map { _.as[String]}
  lazy val distance = attributes.get("@distance") map { _.as[String]}
  lazy val distanceMaximum = attributes.get("@distance-maximum") map { _.as[String]}
  lazy val distanceMinimum = attributes.get("@distance-minimum") map { _.as[String]}
  lazy val measurementUnits = attributes.get("@measurement-units") map { _.as[String]}
  lazy val touches = attributes.get("@touches") map { _.as[String]}
  lazy val aerialsWon = attributes.get("@aerials-won") map { _.as[String]}
  lazy val lineFormation = attributes.get("@line-formation") map { _.as[String]}
}

      


/** Player statistics that are specific to soccer. | Soccer specific statistic information about a player.
*/
case class SoccerPlayerStatsComplexType(statsSoccerOffensive: Seq[org.iptc.sportsml.v3.SoccerStatsOffensiveComplexType] = Nil,
  statsSoccerDefensive: Seq[org.iptc.sportsml.v3.SoccerStatsDefensiveComplexType] = Nil,
  statsSoccerFoul: Seq[org.iptc.sportsml.v3.SoccerStatsFoulComplexType] = Nil,
  attributes: Map[String, scalaxb.DataRecord[Any]] = Map()) extends BaseSoccerStatsComplexTypable with PlayerStatsComplexTypeOption {
  lazy val id = attributes.get("@id") map { _.as[String]}
  lazy val classValue = attributes.get("@class") map { _.as[String]}
  lazy val style = attributes.get("@style") map { _.as[String]}
  lazy val statsCoverage = attributes.get("@stats-coverage") map { _.as[String]}
  lazy val teamCoverage = attributes.get("@team-coverage") map { _.as[TeamCoverage]}
  lazy val durationScope = attributes.get("@duration-scope") map { _.as[String]}
  lazy val alignmentScope = attributes.get("@alignment-scope") map { _.as[AlignmentScope]}
  lazy val position = attributes.get("@position") map { _.as[String]}
  lazy val recordMakingScope = attributes.get("@record-making-scope") map { _.as[String]}
  lazy val scopingLabel = attributes.get("@scoping-label") map { _.as[String]}
  lazy val periodValue = attributes.get("@period-value") map { _.as[String]}
  lazy val periodType = attributes.get("@period-type") map { _.as[String]}
  lazy val startDateTime = attributes.get("@start-date-time") map { _.as[String]}
  lazy val endDateTime = attributes.get("@end-date-time") map { _.as[String]}
  lazy val periodStartDateTime = attributes.get("@period-start-date-time") map { _.as[String]}
  lazy val periodEndDateTime = attributes.get("@period-end-date-time") map { _.as[String]}
  lazy val temporalUnitType = attributes.get("@temporal-unit-type") map { _.as[String]}
  lazy val temporalUnitValue = attributes.get("@temporal-unit-value") map { _.as[String]}
  lazy val eventSpan = attributes.get("@event-span") map { _.as[BigInt]}
  lazy val opponentValue = attributes.get("@opponent-value") map { _.as[String]}
  lazy val opponentType = attributes.get("@opponent-type") map { _.as[String]}
  lazy val team = attributes.get("@team") map { _.as[String]}
  lazy val competition = attributes.get("@competition") map { _.as[String]}
  lazy val unitValue = attributes.get("@unit-value") map { _.as[String]}
  lazy val unitType = attributes.get("@unit-type") map { _.as[String]}
  lazy val situation = attributes.get("@situation") map { _.as[String]}
  lazy val locationKey = attributes.get("@location-key") map { _.as[String]}
  lazy val venueType = attributes.get("@venue-type") map { _.as[String]}
  lazy val surfaceType = attributes.get("@surface-type") map { _.as[String]}
  lazy val weatherType = attributes.get("@weather-type") map { _.as[String]}
  lazy val scopeValue = attributes.get("@scope-value") map { _.as[String]}
  lazy val distance = attributes.get("@distance") map { _.as[String]}
  lazy val distanceMaximum = attributes.get("@distance-maximum") map { _.as[String]}
  lazy val distanceMinimum = attributes.get("@distance-minimum") map { _.as[String]}
  lazy val measurementUnits = attributes.get("@measurement-units") map { _.as[String]}
  lazy val touches = attributes.get("@touches") map { _.as[String]}
  lazy val aerialsWon = attributes.get("@aerials-won") map { _.as[String]}
}

      


trait BaseSoccerStatsComplexTypable {
  def statsSoccerOffensive: Seq[org.iptc.sportsml.v3.SoccerStatsOffensiveComplexType]
  def statsSoccerDefensive: Seq[org.iptc.sportsml.v3.SoccerStatsDefensiveComplexType]
  def statsSoccerFoul: Seq[org.iptc.sportsml.v3.SoccerStatsFoulComplexType]
  def id: Option[String]
  def classValue: Option[String]
  def style: Option[String]
  def statsCoverage: Option[String]
  def teamCoverage: Option[org.iptc.sportsml.v3.TeamCoverage]
  def durationScope: Option[String]
  def alignmentScope: Option[org.iptc.sportsml.v3.AlignmentScope]
  def position: Option[String]
  def recordMakingScope: Option[String]
  def scopingLabel: Option[String]
  def periodValue: Option[String]
  def periodType: Option[String]
  def startDateTime: Option[String]
  def endDateTime: Option[String]
  def periodStartDateTime: Option[String]
  def periodEndDateTime: Option[String]
  def temporalUnitType: Option[String]
  def temporalUnitValue: Option[String]
  def eventSpan: Option[BigInt]
  def opponentValue: Option[String]
  def opponentType: Option[String]
  def team: Option[String]
  def competition: Option[String]
  def unitValue: Option[String]
  def unitType: Option[String]
  def situation: Option[String]
  def locationKey: Option[String]
  def venueType: Option[String]
  def surfaceType: Option[String]
  def weatherType: Option[String]
  def scopeValue: Option[String]
  def distance: Option[String]
  def distanceMaximum: Option[String]
  def distanceMinimum: Option[String]
  def measurementUnits: Option[String]
  def touches: Option[String]
  def aerialsWon: Option[String]
}


case class BaseSoccerStatsComplexType(statsSoccerOffensive: Seq[org.iptc.sportsml.v3.SoccerStatsOffensiveComplexType] = Nil,
  statsSoccerDefensive: Seq[org.iptc.sportsml.v3.SoccerStatsDefensiveComplexType] = Nil,
  statsSoccerFoul: Seq[org.iptc.sportsml.v3.SoccerStatsFoulComplexType] = Nil,
  attributes: Map[String, scalaxb.DataRecord[Any]] = Map()) extends BaseSoccerStatsComplexTypable {
  lazy val id = attributes.get("@id") map { _.as[String]}
  lazy val classValue = attributes.get("@class") map { _.as[String]}
  lazy val style = attributes.get("@style") map { _.as[String]}
  lazy val statsCoverage = attributes.get("@stats-coverage") map { _.as[String]}
  lazy val teamCoverage = attributes.get("@team-coverage") map { _.as[TeamCoverage]}
  lazy val durationScope = attributes.get("@duration-scope") map { _.as[String]}
  lazy val alignmentScope = attributes.get("@alignment-scope") map { _.as[AlignmentScope]}
  lazy val position = attributes.get("@position") map { _.as[String]}
  lazy val recordMakingScope = attributes.get("@record-making-scope") map { _.as[String]}
  lazy val scopingLabel = attributes.get("@scoping-label") map { _.as[String]}
  lazy val periodValue = attributes.get("@period-value") map { _.as[String]}
  lazy val periodType = attributes.get("@period-type") map { _.as[String]}
  lazy val startDateTime = attributes.get("@start-date-time") map { _.as[String]}
  lazy val endDateTime = attributes.get("@end-date-time") map { _.as[String]}
  lazy val periodStartDateTime = attributes.get("@period-start-date-time") map { _.as[String]}
  lazy val periodEndDateTime = attributes.get("@period-end-date-time") map { _.as[String]}
  lazy val temporalUnitType = attributes.get("@temporal-unit-type") map { _.as[String]}
  lazy val temporalUnitValue = attributes.get("@temporal-unit-value") map { _.as[String]}
  lazy val eventSpan = attributes.get("@event-span") map { _.as[BigInt]}
  lazy val opponentValue = attributes.get("@opponent-value") map { _.as[String]}
  lazy val opponentType = attributes.get("@opponent-type") map { _.as[String]}
  lazy val team = attributes.get("@team") map { _.as[String]}
  lazy val competition = attributes.get("@competition") map { _.as[String]}
  lazy val unitValue = attributes.get("@unit-value") map { _.as[String]}
  lazy val unitType = attributes.get("@unit-type") map { _.as[String]}
  lazy val situation = attributes.get("@situation") map { _.as[String]}
  lazy val locationKey = attributes.get("@location-key") map { _.as[String]}
  lazy val venueType = attributes.get("@venue-type") map { _.as[String]}
  lazy val surfaceType = attributes.get("@surface-type") map { _.as[String]}
  lazy val weatherType = attributes.get("@weather-type") map { _.as[String]}
  lazy val scopeValue = attributes.get("@scope-value") map { _.as[String]}
  lazy val distance = attributes.get("@distance") map { _.as[String]}
  lazy val distanceMaximum = attributes.get("@distance-maximum") map { _.as[String]}
  lazy val distanceMinimum = attributes.get("@distance-minimum") map { _.as[String]}
  lazy val measurementUnits = attributes.get("@measurement-units") map { _.as[String]}
  lazy val touches = attributes.get("@touches") map { _.as[String]}
  lazy val aerialsWon = attributes.get("@aerials-won") map { _.as[String]}
}

      


/** Offensive stats specific to soccer. | Offensive stats for one team,
          specific to soccer.
*/
case class SoccerStatsOffensiveComplexType(attributes: Map[String, scalaxb.DataRecord[Any]] = Map()) {
  lazy val id = attributes.get("@id") map { _.as[String]}
  lazy val classValue = attributes.get("@class") map { _.as[String]}
  lazy val style = attributes.get("@style") map { _.as[String]}
  lazy val statsCoverage = attributes.get("@stats-coverage") map { _.as[String]}
  lazy val teamCoverage = attributes.get("@team-coverage") map { _.as[TeamCoverage]}
  lazy val durationScope = attributes.get("@duration-scope") map { _.as[String]}
  lazy val alignmentScope = attributes.get("@alignment-scope") map { _.as[AlignmentScope]}
  lazy val position = attributes.get("@position") map { _.as[String]}
  lazy val recordMakingScope = attributes.get("@record-making-scope") map { _.as[String]}
  lazy val scopingLabel = attributes.get("@scoping-label") map { _.as[String]}
  lazy val periodValue = attributes.get("@period-value") map { _.as[String]}
  lazy val periodType = attributes.get("@period-type") map { _.as[String]}
  lazy val startDateTime = attributes.get("@start-date-time") map { _.as[String]}
  lazy val endDateTime = attributes.get("@end-date-time") map { _.as[String]}
  lazy val periodStartDateTime = attributes.get("@period-start-date-time") map { _.as[String]}
  lazy val periodEndDateTime = attributes.get("@period-end-date-time") map { _.as[String]}
  lazy val temporalUnitType = attributes.get("@temporal-unit-type") map { _.as[String]}
  lazy val temporalUnitValue = attributes.get("@temporal-unit-value") map { _.as[String]}
  lazy val eventSpan = attributes.get("@event-span") map { _.as[BigInt]}
  lazy val opponentValue = attributes.get("@opponent-value") map { _.as[String]}
  lazy val opponentType = attributes.get("@opponent-type") map { _.as[String]}
  lazy val team = attributes.get("@team") map { _.as[String]}
  lazy val competition = attributes.get("@competition") map { _.as[String]}
  lazy val unitValue = attributes.get("@unit-value") map { _.as[String]}
  lazy val unitType = attributes.get("@unit-type") map { _.as[String]}
  lazy val situation = attributes.get("@situation") map { _.as[String]}
  lazy val locationKey = attributes.get("@location-key") map { _.as[String]}
  lazy val venueType = attributes.get("@venue-type") map { _.as[String]}
  lazy val surfaceType = attributes.get("@surface-type") map { _.as[String]}
  lazy val weatherType = attributes.get("@weather-type") map { _.as[String]}
  lazy val scopeValue = attributes.get("@scope-value") map { _.as[String]}
  lazy val distance = attributes.get("@distance") map { _.as[String]}
  lazy val distanceMaximum = attributes.get("@distance-maximum") map { _.as[String]}
  lazy val distanceMinimum = attributes.get("@distance-minimum") map { _.as[String]}
  lazy val measurementUnits = attributes.get("@measurement-units") map { _.as[String]}
  lazy val goalsGameWinning = attributes.get("@goals-game-winning") map { _.as[String]}
  lazy val goalsGameTying = attributes.get("@goals-game-tying") map { _.as[String]}
  lazy val goalsOvertime = attributes.get("@goals-overtime") map { _.as[String]}
  lazy val goalsShootout = attributes.get("@goals-shootout") map { _.as[String]}
  lazy val goalsTotal = attributes.get("@goals-total") map { _.as[String]}
  lazy val assistsGameWinning = attributes.get("@assists-game-winning") map { _.as[String]}
  lazy val assistsGameTying = attributes.get("@assists-game-tying") map { _.as[String]}
  lazy val assistsOvertime = attributes.get("@assists-overtime") map { _.as[String]}
  lazy val assistsTotal = attributes.get("@assists-total") map { _.as[String]}
  lazy val points = attributes.get("@points") map { _.as[String]}
  lazy val shotsTotal = attributes.get("@shots-total") map { _.as[String]}
  lazy val shotsOnGoalTotal = attributes.get("@shots-on-goal-total") map { _.as[String]}
  lazy val shotsOffGoalTotal = attributes.get("@shots-off-goal-total") map { _.as[String]}
  lazy val shotsPenaltyShotTaken = attributes.get("@shots-penalty-shot-taken") map { _.as[String]}
  lazy val shotsPenaltyShotScored = attributes.get("@shots-penalty-shot-scored") map { _.as[String]}
  lazy val shotsPenaltyShotMissed = attributes.get("@shots-penalty-shot-missed") map { _.as[String]}
  lazy val shotsPenaltyShotPercentage = attributes.get("@shots-penalty-shot-percentage") map { _.as[String]}
  lazy val shotsShootoutTaken = attributes.get("@shots-shootout-taken") map { _.as[String]}
  lazy val shotsShootoutScored = attributes.get("@shots-shootout-scored") map { _.as[String]}
  lazy val shotsShootoutMissed = attributes.get("@shots-shootout-missed") map { _.as[String]}
  lazy val shotsShootoutPercentage = attributes.get("@shots-shootout-percentage") map { _.as[String]}
  lazy val giveaways = attributes.get("@giveaways") map { _.as[String]}
  lazy val offsides = attributes.get("@offsides") map { _.as[String]}
  lazy val cornerKicks = attributes.get("@corner-kicks") map { _.as[String]}
  lazy val hatTricks = attributes.get("@hat-tricks") map { _.as[String]}
  lazy val shotsHitFrame = attributes.get("@shots-hit-frame") map { _.as[String]}
  lazy val goalsOwn = attributes.get("@goals-own") map { _.as[String]}
  lazy val freeKicks = attributes.get("@free-kicks") map { _.as[String]}
  lazy val goalsLeftFoot = attributes.get("@goals-left-foot") map { _.as[String]}
  lazy val goalsRightFoot = attributes.get("@goals-right-foot") map { _.as[String]}
  lazy val goalsHead = attributes.get("@goals-head") map { _.as[String]}
  lazy val passesTotal = attributes.get("@passes-total") map { _.as[String]}
  lazy val passesComplete = attributes.get("@passes-complete") map { _.as[String]}
  lazy val passesCompletePercentage = attributes.get("@passes-complete-percentage") map { _.as[String]}
  lazy val passesIncomplete = attributes.get("@passes-incomplete") map { _.as[String]}
  lazy val passesComplete3rdFinal = attributes.get("@passes-complete-3rd-final") map { _.as[String]}
  lazy val passesCompleteLong = attributes.get("@passes-complete-long") map { _.as[String]}
  lazy val tacklesTotal = attributes.get("@tackles-total") map { _.as[String]}
  lazy val tacklesWon = attributes.get("@tackles-won") map { _.as[String]}
  lazy val tacklesWonPercentage = attributes.get("@tackles-won-percentage") map { _.as[String]}
  lazy val tacklesLost = attributes.get("@tackles-lost") map { _.as[String]}
}

      


/** Defensive stats specific to soccer. | Defensive stats for one team,
          specific to soccer.
*/
case class SoccerStatsDefensiveComplexType(attributes: Map[String, scalaxb.DataRecord[Any]] = Map()) {
  lazy val id = attributes.get("@id") map { _.as[String]}
  lazy val classValue = attributes.get("@class") map { _.as[String]}
  lazy val style = attributes.get("@style") map { _.as[String]}
  lazy val statsCoverage = attributes.get("@stats-coverage") map { _.as[String]}
  lazy val teamCoverage = attributes.get("@team-coverage") map { _.as[TeamCoverage]}
  lazy val durationScope = attributes.get("@duration-scope") map { _.as[String]}
  lazy val alignmentScope = attributes.get("@alignment-scope") map { _.as[AlignmentScope]}
  lazy val position = attributes.get("@position") map { _.as[String]}
  lazy val recordMakingScope = attributes.get("@record-making-scope") map { _.as[String]}
  lazy val scopingLabel = attributes.get("@scoping-label") map { _.as[String]}
  lazy val periodValue = attributes.get("@period-value") map { _.as[String]}
  lazy val periodType = attributes.get("@period-type") map { _.as[String]}
  lazy val startDateTime = attributes.get("@start-date-time") map { _.as[String]}
  lazy val endDateTime = attributes.get("@end-date-time") map { _.as[String]}
  lazy val periodStartDateTime = attributes.get("@period-start-date-time") map { _.as[String]}
  lazy val periodEndDateTime = attributes.get("@period-end-date-time") map { _.as[String]}
  lazy val temporalUnitType = attributes.get("@temporal-unit-type") map { _.as[String]}
  lazy val temporalUnitValue = attributes.get("@temporal-unit-value") map { _.as[String]}
  lazy val eventSpan = attributes.get("@event-span") map { _.as[BigInt]}
  lazy val opponentValue = attributes.get("@opponent-value") map { _.as[String]}
  lazy val opponentType = attributes.get("@opponent-type") map { _.as[String]}
  lazy val team = attributes.get("@team") map { _.as[String]}
  lazy val competition = attributes.get("@competition") map { _.as[String]}
  lazy val unitValue = attributes.get("@unit-value") map { _.as[String]}
  lazy val unitType = attributes.get("@unit-type") map { _.as[String]}
  lazy val situation = attributes.get("@situation") map { _.as[String]}
  lazy val locationKey = attributes.get("@location-key") map { _.as[String]}
  lazy val venueType = attributes.get("@venue-type") map { _.as[String]}
  lazy val surfaceType = attributes.get("@surface-type") map { _.as[String]}
  lazy val weatherType = attributes.get("@weather-type") map { _.as[String]}
  lazy val scopeValue = attributes.get("@scope-value") map { _.as[String]}
  lazy val distance = attributes.get("@distance") map { _.as[String]}
  lazy val distanceMaximum = attributes.get("@distance-maximum") map { _.as[String]}
  lazy val distanceMinimum = attributes.get("@distance-minimum") map { _.as[String]}
  lazy val measurementUnits = attributes.get("@measurement-units") map { _.as[String]}
  lazy val shotsPenaltyShotAllowed = attributes.get("@shots-penalty-shot-allowed") map { _.as[String]}
  lazy val goalsPenaltyShotAllowed = attributes.get("@goals-penalty-shot-allowed") map { _.as[String]}
  lazy val goalsAgainstAverage = attributes.get("@goals-against-average") map { _.as[String]}
  lazy val goalsAgainstTotal = attributes.get("@goals-against-total") map { _.as[String]}
  lazy val saves = attributes.get("@saves") map { _.as[String]}
  lazy val savePercentage = attributes.get("@save-percentage") map { _.as[String]}
  lazy val catchesPunches = attributes.get("@catches-punches") map { _.as[String]}
  lazy val shotsOnGoalAgainstTotal = attributes.get("@shots-on-goal-against-total") map { _.as[String]}
  lazy val shotsShootoutTotal = attributes.get("@shots-shootout-total") map { _.as[String]}
  lazy val shotsShootoutAllowed = attributes.get("@shots-shootout-allowed") map { _.as[String]}
  lazy val shotsBlocked = attributes.get("@shots-blocked") map { _.as[String]}
  lazy val shutouts = attributes.get("@shutouts") map { _.as[String]}
  lazy val crosses18YardPlus = attributes.get("@crosses-18-yard-plus") map { _.as[String]}
  lazy val crosses18Yard = attributes.get("@crosses-18-yard") map { _.as[String]}
  lazy val shotsBlockedOutfielder = attributes.get("@shots-blocked-outfielder") map { _.as[String]}
  lazy val shotsBlockedCross = attributes.get("@shots-blocked-cross") map { _.as[String]}
  lazy val clearancesSuccessful = attributes.get("@clearances-successful") map { _.as[String]}
  lazy val interceptions = attributes.get("@interceptions") map { _.as[String]}
}

      


/** Stats specific to fauls, cautions, and ejections. | Could occur while
          players are on the offense, the defense, or even the bench.
*/
case class SoccerStatsFoulComplexType(attributes: Map[String, scalaxb.DataRecord[Any]] = Map()) {
  lazy val id = attributes.get("@id") map { _.as[String]}
  lazy val classValue = attributes.get("@class") map { _.as[String]}
  lazy val style = attributes.get("@style") map { _.as[String]}
  lazy val statsCoverage = attributes.get("@stats-coverage") map { _.as[String]}
  lazy val teamCoverage = attributes.get("@team-coverage") map { _.as[TeamCoverage]}
  lazy val durationScope = attributes.get("@duration-scope") map { _.as[String]}
  lazy val alignmentScope = attributes.get("@alignment-scope") map { _.as[AlignmentScope]}
  lazy val position = attributes.get("@position") map { _.as[String]}
  lazy val recordMakingScope = attributes.get("@record-making-scope") map { _.as[String]}
  lazy val scopingLabel = attributes.get("@scoping-label") map { _.as[String]}
  lazy val periodValue = attributes.get("@period-value") map { _.as[String]}
  lazy val periodType = attributes.get("@period-type") map { _.as[String]}
  lazy val startDateTime = attributes.get("@start-date-time") map { _.as[String]}
  lazy val endDateTime = attributes.get("@end-date-time") map { _.as[String]}
  lazy val periodStartDateTime = attributes.get("@period-start-date-time") map { _.as[String]}
  lazy val periodEndDateTime = attributes.get("@period-end-date-time") map { _.as[String]}
  lazy val temporalUnitType = attributes.get("@temporal-unit-type") map { _.as[String]}
  lazy val temporalUnitValue = attributes.get("@temporal-unit-value") map { _.as[String]}
  lazy val eventSpan = attributes.get("@event-span") map { _.as[BigInt]}
  lazy val opponentValue = attributes.get("@opponent-value") map { _.as[String]}
  lazy val opponentType = attributes.get("@opponent-type") map { _.as[String]}
  lazy val team = attributes.get("@team") map { _.as[String]}
  lazy val competition = attributes.get("@competition") map { _.as[String]}
  lazy val unitValue = attributes.get("@unit-value") map { _.as[String]}
  lazy val unitType = attributes.get("@unit-type") map { _.as[String]}
  lazy val situation = attributes.get("@situation") map { _.as[String]}
  lazy val locationKey = attributes.get("@location-key") map { _.as[String]}
  lazy val venueType = attributes.get("@venue-type") map { _.as[String]}
  lazy val surfaceType = attributes.get("@surface-type") map { _.as[String]}
  lazy val weatherType = attributes.get("@weather-type") map { _.as[String]}
  lazy val scopeValue = attributes.get("@scope-value") map { _.as[String]}
  lazy val distance = attributes.get("@distance") map { _.as[String]}
  lazy val distanceMaximum = attributes.get("@distance-maximum") map { _.as[String]}
  lazy val distanceMinimum = attributes.get("@distance-minimum") map { _.as[String]}
  lazy val measurementUnits = attributes.get("@measurement-units") map { _.as[String]}
  lazy val foulsCommited = attributes.get("@fouls-commited") map { _.as[String]}
  lazy val foulsSuffered = attributes.get("@fouls-suffered") map { _.as[String]}
  lazy val cautionsTotal = attributes.get("@cautions-total") map { _.as[String]}
  lazy val cautionsPending = attributes.get("@cautions-pending") map { _.as[String]}
  lazy val cautionPointsTotal = attributes.get("@caution-points-total") map { _.as[String]}
  lazy val cautionPointsPending = attributes.get("@caution-points-pending") map { _.as[String]}
  lazy val ejectionsTotal = attributes.get("@ejections-total") map { _.as[String]}
  lazy val ejectionsSecondCaution = attributes.get("@ejections-second-caution") map { _.as[String]}
  lazy val ejectionsStraight = attributes.get("@ejections-straight") map { _.as[String]}
}

      


