package com.github.catvod.spider.merge.d0;

import android.app.Activity;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.W.i;
import com.github.catvod.spider.merge.W.q;
import com.github.catvod.spider.merge.W.t;
import com.github.catvod.spider.merge.W.w;
import com.github.catvod.spider.merge.W.x;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.g0.AbstractC0308c;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.google.gson.JsonObject;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f764short = {3023, 2996, 2998, 3023, 2884, 945, 948, 948, 899, 933, 928, 928, 930, 949, 931, 931, 949, 948, 460, 3113, 2426, 2431, 2431, 2376, 2414, 2411, 2411, 2409, 2430, 2408, 2408, 2430, 2431, 3145, 3144, 3089, 3079, 3094, 3080, 818, 806, 807, 828, 804, 803, 818, 829, 1647, 1637, 1603, 1606, 1609, 1610, 1618, 880, 876, 876, 872, 875, 802, 823, 823, 895, 881, 876, 893, 893, 822, 891, 887, 885, 823, 866, 882, 813, 810, 809, 882, 882, 823, 884, 881, 876, 876, 884, 893, 821, 876, 881, 895, 893, 874, 821, 875, 872, 887, 876, 823, 874, 889, 879, 823, 885, 889, 875, 876, 893, 874, 823, 886, 893, 879, 875, 879, 881, 886, 822, 876, 864, 876, 1505, 1533, 1533, 1529, 1530, 1459, 1446, 1446, 1457, 1456, 1467, 1469, 1447, 1506, 1530, 1533, 1510, 1531, 1516, 1447, 1530, 1529, 1512, 1514, 1516, 1446, 1508, 1507, 1512, 1531, 1446, 1532, 1531, 1509, 1507, 1530, 1510, 1511, 1447, 1533, 1521, 1533, 494};
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i) {
        this.a = i;
    }

    public static boolean a(String str) {
        try {
            return !C0057.m8953(str);
        } catch (Exception unused) {
            return false;
        }
    }

    public static String b(String str) {
        try {
            File file = new File(C0003.m1375(C0022.m4453()), C0050.m8125(C0040.m6584(m7852(), 0, 4, 3040), str));
            StringBuilder sb = new StringBuilder();
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while (true) {
                try {
                    String strM4438 = C0022.m4438(bufferedReader);
                    if (strM4438 == null) {
                        C0057.m8961(bufferedReader);
                        return C0047.m7763(sb);
                    }
                    C0018.m3933(sb, strM4438);
                    C0018.m3933(sb, C0054.m8574(m7852(), 4, 1, 2894));
                } catch (Throwable th) {
                    try {
                        C0057.m8961(bufferedReader);
                    } catch (Throwable th2) {
                        try {
                            C0052.m8352(C0057.m8970(Throwable.class, C0062.m9389(m7852(), 5, 13, 976), new Class[]{Throwable.class}), th, new Object[]{th2});
                        } catch (Exception unused) {
                        }
                    }
                    throw th;
                }
            }
        } catch (IOException | Exception unused2) {
            return C0007.m1840();
        }
    }

    public static String c(String str) {
        try {
            File file = new File(C0003.m1375(C0022.m4453()), C0050.m8125(C0042.m7151(m7852(), 18, 1, 483), str));
            StringBuilder sb = new StringBuilder();
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while (true) {
                try {
                    String strM4438 = C0022.m4438(bufferedReader);
                    if (strM4438 == null) {
                        C0057.m8961(bufferedReader);
                        return C0047.m7763(sb);
                    }
                    C0018.m3933(sb, strM4438);
                    C0018.m3933(sb, C0002.m1305(m7852(), 19, 1, 3107));
                } catch (Throwable th) {
                    try {
                        C0057.m8961(bufferedReader);
                    } catch (Throwable th2) {
                        try {
                            C0052.m8352(C0057.m8970(Throwable.class, C0040.m6584(m7852(), 20, 13, 2331), new Class[]{Throwable.class}), th, new Object[]{th2});
                        } catch (Exception unused) {
                        }
                    }
                    throw th;
                }
            }
        } catch (IOException | Exception unused2) {
            return C0007.m1840();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void d() {
        /*
            Method dump skipped, instructions count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.d0.b.d():void");
    }

    /* renamed from: ۟ۡۦۦ, reason: not valid java name and contains not printable characters */
    public static short[] m7852() {
        if (C0054.m8557() < 0) {
            return f764short;
        }
        return null;
    }

    /* renamed from: ۦۡ۠۠, reason: contains not printable characters */
    public static boolean m7853(Object obj, Object obj2, boolean z) {
        if (C0051.m8216() < 0) {
            return AbstractC0308c.a((JsonObject) obj, (String) obj2, z);
        }
        return false;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x xVarM6556;
        switch (C0040.m6665(this)) {
            case 0:
                try {
                    C0008.m1997(new File(C0003.m1375(C0022.m4453()), C0032.m5708(m7852(), 47, 7, 1575)));
                    com.github.catvod.spider.merge.D.f fVarM6110 = C0035.m6110();
                    C0032.m5769(C0045.m7657(m7852(), 54, 66, 792), null);
                    C0047.m7777(fVarM6110);
                    String[] strArrM4752 = C0024.m4752(C0032.m5769(C0044.m7509(m7852(), 120, 42, 1417), null), C0003.m1398(m7852(), 162, 1, 484));
                    String str = new String(C0007.m1882(strArrM4752[0]));
                    Activity activityM4453 = C0022.m4453();
                    C0004.m1575();
                    synchronized (x.class) {
                        xVarM6556 = C0039.m6556(activityM4453);
                    }
                    try {
                        Activity activityM6491 = C0039.m6491(xVarM6556);
                        C0037.m6386(activityM6491, new i(0, str, xVarM6556, activityM6491));
                    } catch (Exception unused) {
                    }
                    String str2 = new String(C0007.m1882(strArrM4752[1]));
                    q qVarM4023 = C0019.m4023(C0022.m4453());
                    try {
                        Activity activityM1234 = C0001.m1234(qVarM4023);
                        C0037.m6386(activityM1234, new i(1, str2, qVarM4023, activityM1234));
                    } catch (Exception unused2) {
                    }
                    String str3 = new String(C0007.m1882(strArrM4752[2]));
                    t tVarM2373 = C0010.m2373(C0022.m4453());
                    try {
                        Activity activityM3460 = C0015.m3460(tVarM2373);
                        C0037.m6386(activityM3460, new i(2, str3, tVarM2373, activityM3460));
                    } catch (Exception unused3) {
                    }
                    String str4 = new String(C0007.m1882(strArrM4752[3]));
                    w wVarM8370 = C0052.m8370(C0022.m4453());
                    Activity activityM5173 = C0028.m5173(wVarM8370);
                    C0037.m6386(activityM5173, new i(3, str4, wVarM8370, activityM5173));
                    return;
                } catch (Exception unused4) {
                    return;
                }
            default:
                try {
                    C0051.m8232();
                    f fVar = new f();
                    if (C0051.m8260(fVar)) {
                        return;
                    }
                    fVar.b = true;
                    Thread thread = new Thread(fVar);
                    fVar.a = thread;
                    C0024.m4682(thread);
                    return;
                } catch (Exception unused5) {
                    return;
                }
        }
    }
}