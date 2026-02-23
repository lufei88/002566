package com.github.catvod.spider.merge.P0;

import com.github.catvod.spider.merge.V.C0032;
import java.util.TimeZone;

/* loaded from: classes.dex */
public final class l {
    public final TimeZone a;
    public final int b;

    public l(TimeZone timeZone, boolean z) {
        this.a = timeZone;
        this.b = z ? C0032.m5674(timeZone) : 0;
    }
}