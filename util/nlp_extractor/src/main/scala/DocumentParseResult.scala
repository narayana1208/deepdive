package org.deepdive.udf.nlp

case class SentenceParseResult(sentence: String, words: List[String], lemma: List[String], 
  wordsWithPos: List[String], deps: List[String], nerTags: List[String], dcoref: List[Map[String, String]])
case class DocumentParseResult(sentences: List[SentenceParseResult])