package com.github.catvod.spider.merge.P0;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import java.util.Date;
import java.util.TimeZone;

/* loaded from: classes.dex */
public final class E extends TimeZone {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f475short = {1342, 1332, 1325, 1414, 1483, 1487, 1480, 1491, 1490, 1475, 1493, 1414, 1481, 1491, 1490, 1414, 1481, 1472, 1414, 1492, 1479, 1480, 1473, 1475, 1607, 1551, 1544, 1554, 1557, 1556, 1607, 1544, 1554, 1555, 1607, 1544, 1537, 1607, 1557, 1542, 1545, 1536, 1538, 2703, 2707, 2745, 2720, 2688, 2749, 2745, 2737, 2702, 2747, 2746, 2737, 2804, 2749, 2736, 2793, 2806, 1858, 1868, 1807, 1798, 1798, 1811, 1797, 1812, 1885};
    public final int a;
    public final String b;

    public E(int i, int i2, boolean z) {
        if (i >= 24) {
            StringBuilder sb = new StringBuilder();
            C0036.m6177(sb, i);
            C0018.m3933(sb, C0038.m6452(m4631(), 24, 19, 1639));
            throw new IllegalArgumentException(C0047.m7763(sb));
        }
        if (i2 >= 60) {
            StringBuilder sb2 = new StringBuilder();
            C0036.m6177(sb2, i2);
            C0018.m3933(sb2, C0010.m2300(m4631(), 3, 21, 1446));
            throw new IllegalArgumentException(C0047.m7763(sb2));
        }
        int i3 = ((i * 60) + i2) * 60000;
        this.a = z ? -i3 : i3;
        StringBuilder sb3 = new StringBuilder(9);
        C0018.m3933(sb3, C0060.m9352(m4631(), 0, 3, 1401));
        C0062.m9399(sb3, z ? '-' : '+');
        C0062.m9399(sb3, (char) ((i / 10) + 48));
        C0062.m9399(sb3, (char) ((i % 10) + 48));
        C0062.m9399(sb3, ':');
        C0062.m9399(sb3, (char) ((i2 / 10) + 48));
        C0062.m9399(sb3, (char) ((i2 % 10) + 48));
        this.b = C0047.m7763(sb3);
    }

    /* renamed from: ۢ۟۟ۧ, reason: not valid java name and contains not printable characters */
    public static short[] m4631() {
        if (C0062.m9429() >= 0) {
            return f475short;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof E) {
            return C0033.m5842(this) == C0033.m5842((E) obj);
        }
        return false;
    }

    @Override // java.util.TimeZone
    public final String getID() {
        return C0033.m5842(this);
    }

    @Override // java.util.TimeZone
    public final int getOffset(int i, int i2, int i3, int i4, int i5, int i6) {
        return C0029.m5244(this);
    }

    @Override // java.util.TimeZone
    public final int getRawOffset() {
        return C0029.m5244(this);
    }

    public final int hashCode() {
        return C0029.m5244(this);
    }

    @Override // java.util.TimeZone
    public final boolean inDaylightTime(Date date) {
        return false;
    }

    @Override // java.util.TimeZone
    public final void setRawOffset(int i) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(C0022.m4403(m4631(), 43, 17, 2772));
        C0018.m3933(sb, C0033.m5842(this));
        C0018.m3933(sb, C0063.m9585(m4631(), 60, 9, 1888));
        C0036.m6177(sb, C0029.m5244(this));
        C0062.m9399(sb, ']');
        return C0047.m7763(sb);
    }

    @Override // java.util.TimeZone
    public final boolean useDaylightTime() {
        return false;
    }
}