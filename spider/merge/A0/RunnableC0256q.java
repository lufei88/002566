package com.github.catvod.spider.merge.a0;

import android.R;
import android.app.AlertDialog;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.util.HashMap;

/* renamed from: com.github.catvod.spider.merge.a0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0256q implements Runnable {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f728short = {2056, 2055, 2050, 2062, 2053, 2079, 2100, 2050, 2063, 1759, 1748, 1757, 809, 3073, 3102, 3074, 3010, 3029, 3009, 3013, 3029, 3011, 3012, 3055, 3033, 3028, 1985, 2013, 2013, 2009, 2010, 1939, 1926, 1926, 1989, 1990, 1998, 1984, 1991, 1927, 1944, 1947, 1946, 2009, 1992, 1991, 1927, 1994, 1990, 1988, 1926, 1992, 2009, 1984, 1926, 2012, 2010, 1996, 2011, 1926, 2008, 2011, 1924, 1994, 1990, 1997, 1996, 1926, 1998, 1996, 1991, 1996, 2011, 1992, 2013, 1996, 1492, 1488, 2559, 2554, 2543, 2554, 2765, 2774, 2769, 2801, 2812, -29099, -30159, 21703, 1427, 1424, 1425, -30588, 22101, -32195, -31143, 22703, 2555, 2552, 2553, 21004, 29131, -30214, 29814, 21352, 637, 572, 575, 574, 24603, 24678, 31244, 24659, 31289, 21527, -29339, 27214, 28530, 32291, 22285, 2168, -31825, 24432, 30439, -31305, 18037, -31770, 30518, 2056, 2153, 2154, 2155};
    public final /* synthetic */ int a;
    public final /* synthetic */ C0259u b;

    public /* synthetic */ RunnableC0256q(C0259u c0259u, int i) {
        this.a = i;
        this.b = c0259u;
    }

    /* renamed from: ۟ۤۨ۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m7072(Object obj) {
        if (C0040.m6582() > 0) {
            return ((JsonPrimitive) obj).getAsString();
        }
        return null;
    }

    /* renamed from: ۟ۦ۟ۢۦ, reason: not valid java name and contains not printable characters */
    public static JsonPrimitive m7073(Object obj, Object obj2) {
        if (C0053.m8389() >= 0) {
            return ((JsonObject) obj).getAsJsonPrimitive((String) obj2);
        }
        return null;
    }

    /* renamed from: ۥۣۣۡ, reason: contains not printable characters */
    public static JsonObject m7074(Object obj, Object obj2) {
        if (C0009.m2047() >= 0) {
            return ((JsonObject) obj).getAsJsonObject((String) obj2);
        }
        return null;
    }

    /* renamed from: ۧۦ۠ۦ, reason: not valid java name and contains not printable characters */
    public static short[] m7075() {
        if (C0035.m6140() <= 0) {
            return f728short;
        }
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (C0017.m3676(this)) {
            case 0:
                C0259u c0259uM5047 = C0027.m5047(this);
                C0047.m7777(c0259uM5047);
                try {
                    if (!C0022.m4441(c0259uM5047)) {
                        int iM3103 = C0013.m3103(16);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                        FrameLayout frameLayout = new FrameLayout(C0031.m5652());
                        C0012.m2963(layoutParams, iM3103, iM3103, iM3103, iM3103);
                        EditText editText = new EditText(C0031.m5652());
                        C0009.m2052(editText, C0046.m7718(m7075(), 87, 8, 1442));
                        C0041.m6790(frameLayout, editText, layoutParams);
                        EditText editText2 = new EditText(C0031.m5652());
                        C0009.m2052(editText2, C0061.m9361(m7075(), 95, 8, 2506));
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
                        C0012.m2963(layoutParams2, iM3103, (iM3103 * 4) + C0036.m6186(editText), iM3103, iM3103);
                        C0041.m6790(frameLayout, editText2, layoutParams2);
                        AlertDialog alertDialogM7328 = C0043.m7328(C0049.m8029(C0030.m5442(C0020.m4201(C0047.m7848(C0036.m6223(new AlertDialog.Builder(C0022.m4453()), C0046.m7718(m7075(), 103, 10, 525)), frameLayout), C0020.m4199(m7075(), 113, 2, 568), new r(c0259uM5047, 0)), R.string.cancel, new r(c0259uM5047, 1)), R.string.ok, new DialogInterfaceOnClickListenerC0257s(c0259uM5047, editText, editText2, 0)));
                        c0259uM5047.e = alertDialogM7328;
                        C0025.m4769(alertDialogM7328, new DialogInterfaceOnDismissListenerC0250k(1, c0259uM5047));
                        C0007.m1816(C0006.m1792(c0259uM5047));
                        break;
                    }
                } catch (Exception unused) {
                    C0038.m6402(C0047.m7833(m7075(), 115, 18, 2136));
                    return;
                }
                break;
            case 1:
                C0001.m1197(C0027.m5047(this));
                break;
            default:
                C0259u c0259uM50472 = C0027.m5047(this);
                C0047.m7777(c0259uM50472);
                HashMap map = new HashMap();
                C0053.m8424(map, C0010.m2300(m7075(), 0, 9, 2155), C0049.m8007(m7075(), 9, 3, 1772));
                C0053.m8424(map, C0001.m1189(m7075(), 12, 1, 863), C0008.m1970(m7075(), 13, 3, 3120));
                C0053.m8424(map, C0005.m1645(m7075(), 16, 10, 2992), C0026.m4903(C0055.m8713()));
                String strM2029 = C0008.m2029(C0007.m1803(C0013.m3106(m7075(), 26, 50, 1961), map, new HashMap()));
                C0016.m3575(new RunnableC0241b(c0259uM50472, C0058.m9127(strM2029, C0023.m4536(m7075(), 76, 2, 1467)) ? m7072(m7073(m7074((JsonObject) C0033.m5856(strM2029, JsonObject.class), C0003.m1398(m7075(), 78, 4, 2459)), C0064.m9599(m7075(), 82, 5, 2744))) : C0007.m1840(), 3));
                break;
        }
    }
}