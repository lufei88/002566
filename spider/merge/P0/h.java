package com.github.catvod.spider.merge.P0;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import java.text.ParsePosition;
import java.util.Calendar;

/* loaded from: classes.dex */
public class h extends j {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f482short = {2475, 2448, 2440, 2439, 2432, 2455, 2486, 2449, 2455, 2436, 2449, 2432, 2434, 2460, 2501, 2494, 2435, 2444, 2432, 2441, 2433, 2520, 2416};
    public final int a;

    public h(int i) {
        this.a = i;
    }

    /* renamed from: ۣ۟۠ۡۥ, reason: not valid java name and contains not printable characters */
    public static short[] m4638() {
        if (C0011.m2755() > 0) {
            return f482short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.P0.j
    public final boolean a() {
        return true;
    }

    @Override // com.github.catvod.spider.merge.P0.j
    public final boolean b(n nVar, Calendar calendar, String str, ParsePosition parsePosition, int i) {
        int iM1829 = C0007.m1829(parsePosition);
        int iM1584 = C0004.m1584(str);
        if (i == 0) {
            while (iM1829 < iM1584 && C0005.m1617(C0007.m1823(str, iM1829))) {
                iM1829++;
            }
            C0015.m3487(parsePosition, iM1829);
        } else {
            int i2 = i + iM1829;
            if (iM1584 > i2) {
                iM1584 = i2;
            }
        }
        while (iM1829 < iM1584 && C0064.m9611(C0007.m1823(str, iM1829))) {
            iM1829++;
        }
        if (C0007.m1829(parsePosition) == iM1829) {
            C0035.m6091(parsePosition, iM1829);
            return false;
        }
        int iM6456 = C0038.m6456(C0054.m8636(str, C0007.m1829(parsePosition), iM1829));
        C0015.m3487(parsePosition, iM1829);
        C0065.m9714(calendar, C0029.m5217(this), C0044.m7389(this, nVar, iM6456));
        return true;
    }

    public int c(n nVar, int i) {
        return i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(C0051.m8259(m4638(), 0, 22, 2533));
        C0036.m6177(sb, C0029.m5217(this));
        C0018.m3933(sb, C0019.m4107(m4638(), 22, 1, 2349));
        return C0047.m7763(sb);
    }
}