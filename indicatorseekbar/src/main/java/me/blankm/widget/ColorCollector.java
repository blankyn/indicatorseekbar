package me.blankm.widget;


import androidx.annotation.ColorInt;

/**
 * for collecting each section track color
 * Donation/打赏:
 * If this library is helpful to you ,you can give me a donation by:
 *
 */
public interface ColorCollector {
    /**
     * to collect each section track's color
     *
     * @param colorIntArr ColorInt the container for each section tracks' color.
     *                    this array's length will auto equals section track' count.
     * @return True if apply color , otherwise no change
     */
    boolean collectSectionTrackColor(@ColorInt int[] colorIntArr);
}