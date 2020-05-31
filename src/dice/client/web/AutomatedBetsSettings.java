//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package dice.client.web;

import java.math.BigDecimal;
import java.math.MathContext;

public class AutomatedBetsSettings {
	private BigDecimal basePayIn;
	private BigDecimal maxAllowedPayIn;
	private BigDecimal increaseOnWinPercent;
	private BigDecimal increaseOnLosePercent;
	private BigDecimal stopMaxBalance;
	private BigDecimal stopMinBalance;
	private BigDecimal startingPayIn;
	private long guessLow;
	private long guessHigh;
	private int maxBets;
	private boolean resetOnWin;
	private boolean resetOnLose;
	private boolean resetOnLoseMaxBet;
	private boolean stopOnLoseMaxBet;
	private boolean compact;
	private Integer clientSeed;

	public AutomatedBetsSettings() {
	}

	private static BigDecimal forceNotNull(BigDecimal num) {
		return num == null ? BigDecimal.ZERO : num;
	}

	private static BigDecimal forceNegative(BigDecimal num) {
		num = forceNotNull(num);
		return num.signum() > 0 ? num.negate() : num;
	}

	private static BigDecimal round6(BigDecimal num) {
		return forceNotNull(num).movePointLeft(6).round(MathContext.DECIMAL128).movePointRight(6);
	}

	public BigDecimal getBasePayIn() {
		return forceNegative(this.basePayIn);
	}

	public void setBasePayIn(BigDecimal basePayIn) {
		this.basePayIn = basePayIn;
	}

	public BigDecimal getMaxAllowedPayIn() {
		return forceNegative(this.maxAllowedPayIn);
	}

	public void setMaxAllowedPayIn(BigDecimal maxAllowedPayIn) {
		this.maxAllowedPayIn = maxAllowedPayIn;
	}

	public BigDecimal getIncreaseOnWinPercent() {
		return round6(this.increaseOnWinPercent);
	}

	public void setIncreaseOnWinPercent(BigDecimal increaseOnWinPercent) {
		this.increaseOnWinPercent = increaseOnWinPercent;
	}

	public BigDecimal getIncreaseOnLosePercent() {
		return round6(this.increaseOnLosePercent);
	}

	public void setIncreaseOnLosePercent(BigDecimal increaseOnLosePercent) {
		this.increaseOnLosePercent = increaseOnLosePercent;
	}

	public BigDecimal getStopMaxBalance() {
		return forceNotNull(this.stopMaxBalance);
	}

	public void setStopMaxBalance(BigDecimal stopMaxBalance) {
		this.stopMaxBalance = stopMaxBalance;
	}

	public BigDecimal getStopMinBalance() {
		return forceNotNull(this.stopMinBalance);
	}

	public void setStopMinBalance(BigDecimal stopMinBalance) {
		this.stopMinBalance = stopMinBalance;
	}

	public BigDecimal getStartingPayIn() {
		BigDecimal num = forceNegative(this.startingPayIn);
		return num.signum() == 0 ? this.getBasePayIn() : num;
	}

	public void setStartingPayIn(BigDecimal startingPayIn) {
		this.startingPayIn = startingPayIn;
	}

	public long getGuessLow() {
		return this.guessLow;
	}

	public void setGuessLow(long guessLow) {
		this.guessLow = guessLow;
	}

	public long getGuessHigh() {
		return this.guessHigh;
	}

	public void setGuessHigh(long guessHigh) {
		this.guessHigh = guessHigh;
	}

	public int getMaxBets() {
		return this.maxBets;
	}

	public void setMaxBets(int maxBets) {
		this.maxBets = maxBets;
	}

	public boolean isResetOnWin() {
		return this.resetOnWin;
	}

	public void setResetOnWin(boolean resetOnWin) {
		this.resetOnWin = resetOnWin;
	}

	public boolean isResetOnLose() {
		return this.resetOnLose;
	}

	public void setResetOnLose(boolean resetOnLose) {
		this.resetOnLose = resetOnLose;
	}

	public boolean isResetOnLoseMaxBet() {
		return this.resetOnLoseMaxBet;
	}

	public void setResetOnLoseMaxBet(boolean resetOnLoseMaxBet) {
		this.resetOnLoseMaxBet = resetOnLoseMaxBet;
	}

	public boolean isStopOnLoseMaxBet() {
		return this.stopOnLoseMaxBet;
	}

	public void setStopOnLoseMaxBet(boolean stopOnLoseMaxBet) {
		this.stopOnLoseMaxBet = stopOnLoseMaxBet;
	}

	public boolean isCompact() {
		return this.compact;
	}

	public void setCompact(boolean compact) {
		this.compact = compact;
	}

	public Integer getClientSeed() {
		return this.clientSeed;
	}

	public void setClientSeed(Integer clientSeed) {
		this.clientSeed = clientSeed;
	}
}
