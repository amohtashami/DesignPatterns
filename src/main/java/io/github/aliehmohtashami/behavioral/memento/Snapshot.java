package io.github.aliehmohtashami.behavioral.memento;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Author alieh on 1/9/22
 */
/*
  plays memento role
 */
@Getter
@AllArgsConstructor
public class Snapshot {
	private long healthPercentage;
	private int gemNumbers;
	private int level;

}
