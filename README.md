# Vibrate

Alternative vibrate extension primarially for Android

https://github.com/subsoap/vibrate/archive/master.zip

```vibrate.vibrate(duration)```

If duration is not set it will default to 100.

```vibrate.cancel()```

```vibrate.vibrate({pattern})```

For example, ```vibrate.vibrate({0, 100, 200, 100, 500, 1000, 100, 250, 1000, 100})```

Patterns work based on {delay, duration, delay, duration ...} so in the example above there is no initial delay for the duration of 100ms, then a 200ms delay before another 100ms vibration duration and so on. Naturally you will want an even number of durations, and only use positive whole numbers.