package com.github.catvod.spider.merge.T;

import android.content.Context;
import android.content.Intent;
import com.github.catvod.debug.MainActivity;
import com.github.catvod.debug.testActivity;
import com.github.catvod.spider.Mogg;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.orhanobut.logger.Logger;
import com.orhanobut.logger.Printer;
import java.util.HashMap;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f498short = {2180, 916, 1669, 1671, 1682, 1667, 1665, 1673, 1684, 1695, 1701, 1673, 1672, 1682, 1667, 1672, 1682, 2190, 2195, 2207, 2183, 611, 615, 593, 602, 551, 628, 600, 595, 600, 595, 622, 578, 545, 569, 638, 593, 622, 614, 581, 595, 547, 615, 579, 555, 1587, 1588, 1590, 1598, 1560, 1588, 1589, 1583, 1598, 1589, 1583};
    public final /* synthetic */ int a;
    public final /* synthetic */ testActivity b;

    public /* synthetic */ d(testActivity testactivity, int i) {
        this.a = i;
        this.b = testactivity;
    }

    /* renamed from: ۣ۟ۡۨۦ, reason: not valid java name and contains not printable characters */
    public static Printer m5308(Object obj) {
        if (C0056.m8886() <= 0) {
            return Logger.t((String) obj);
        }
        return null;
    }

    /* renamed from: ۟ۦۧ۠ۥ, reason: not valid java name and contains not printable characters */
    public static short[] m5309() {
        if (C0054.m8557() < 0) {
            return f498short;
        }
        return null;
    }

    /* renamed from: ۠ۦۣۨ, reason: not valid java name and contains not printable characters */
    public static void m5310(Object obj, Object obj2) {
        if (C0049.m8038() < 0) {
            ((Printer) obj).d(obj2);
        }
    }

    /* renamed from: ۡۥۡۡ, reason: not valid java name and contains not printable characters */
    public static Mogg m5311(Object obj) {
        if (C0047.m7837() > 0) {
            return ((testActivity) obj).b;
        }
        return null;
    }

    /* renamed from: ۣۤۤۨ, reason: not valid java name and contains not printable characters */
    public static int m5312() {
        if (C0015.m3433() >= 0) {
            return testActivity.c;
        }
        return 0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        testActivity testactivityM1713 = C0006.m1713(this);
        switch (C0051.m8263(this)) {
            case 0:
                C0047.m7777(testactivityM1713);
                try {
                    m5310(m5308(C0049.m8007(m5309(), 45, 11, 1627)), C0032.m5697(m5311(testactivityM1713), true));
                    break;
                } catch (Throwable th) {
                    C0049.m7975(th);
                    return;
                }
            case 1:
                m5312();
                C0047.m7777(testactivityM1713);
                try {
                    Mogg mogg = new Mogg();
                    testactivityM1713.b = mogg;
                    C0026.m4931(mogg, testactivityM1713, C0028.m5109(m5309(), 21, 24, 534));
                    break;
                } catch (Throwable th2) {
                    C0049.m7975(th2);
                    return;
                }
            case 2:
                C0047.m7777(testactivityM1713);
                break;
            case 3:
                C0047.m7777(testactivityM1713);
                try {
                    C0032.m5680(testactivityM1713, new Intent((Context) testactivityM1713, (Class<?>) MainActivity.class));
                    break;
                } catch (Throwable th3) {
                    C0049.m7975(th3);
                    return;
                }
            default:
                C0047.m7777(testactivityM1713);
                String strM8574 = C0054.m8574(m5309(), 0, 1, 2229);
                try {
                    HashMap map = new HashMap();
                    C0053.m8424(map, C0044.m7509(m5309(), 1, 1, 994), strM8574);
                    m5310(m5308(C0060.m9352(m5309(), 2, 15, 1766)), C0012.m3037(m5311(testactivityM1713), C0017.m3646(m5309(), 17, 4, 2278), strM8574, true, map));
                    break;
                } catch (Throwable th4) {
                    C0049.m7975(th4);
                }
        }
    }
}