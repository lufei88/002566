package com.github.catvod.spider.merge.b0;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.github.catvod.spider.Config;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;

/* renamed from: com.github.catvod.spider.merge.b0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0263a implements Runnable {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f747short = {679, 729, 671, 722, 1530, 1516, 23270, 21141, 27493, 23284, 23417, 27408, 27759, 32326, 29525, 25623, 22466, 22961, -2098, 23341, -30657, 18392, 21310, -30410, -31955, 28546, -24676, 22205, 23688, 22855, 21371, 1670, 1784, 1726, 1779, 21872, 22708, 21121, 22987, 22456, 21053, -26973, 23245, 20962, 1651, 1586, 1585, 1584, 1628, 1638, 1645, 1634, 1633, 1647, 1638, 1423, 1420, 1412, 1417, 1432, 1458, 1416, 1411, 1420, 1423, 1409, 1416, 1436, 1409, 1417, 1414, 1425, 1409, 1463, 1421, 1414, 1417, 1418, 1412, 1421, 2336, 2358, 2314, 2352, 2363, 2356, 2359, 2361, 2352, 2212, 2208, 2228, 2215, 2238, 2186, 2224, 2235, 2228, 2231, 2233, 2224, 2620, 2609, 2602, 2600, 2593, 2605, 2587, 2593, 2602, 2597, 2598, 2600, 2593};
    public final /* synthetic */ int a;
    public final /* synthetic */ Config b;

    public /* synthetic */ RunnableC0263a(Config config, int i) {
        this.a = i;
        this.b = config;
    }

    /* renamed from: ۟ۢۦۢۤ, reason: not valid java name and contains not printable characters */
    public static short[] m7515() {
        if (C0003.m1463() <= 0) {
            return f747short;
        }
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (C0051.m8264(this)) {
            case 0:
                C0047.m7777(C0040.m6663(this));
                C0034.m5978(C0023.m4536(m7515(), 101, 13, 2628));
                break;
            case 1:
                Config configM6663 = C0040.m6663(this);
                C0047.m7777(configM6663);
                try {
                    C0034.m6016(configM6663, false);
                    ProgressDialog progressDialogM4238 = C0020.m4238();
                    if (progressDialogM4238 != null) {
                        C0004.m1577(progressDialogM4238);
                        break;
                    }
                } catch (Exception e) {
                    C0049.m7975(e);
                    return;
                }
                break;
            case 2:
                C0047.m7777(C0040.m6663(this));
                C0034.m5978(C0034.m6001(m7515(), 89, 12, 2261));
                break;
            case 3:
                C0047.m7777(C0040.m6663(this));
                C0034.m5978(C0020.m4199(m7515(), 80, 9, 2389));
                break;
            case 4:
                C0047.m7777(C0040.m6663(this));
                C0034.m5978(C0036.m6188(m7515(), 67, 13, 1512));
                break;
            case 5:
                C0047.m7777(C0040.m6663(this));
                C0034.m5978(C0041.m6779(m7515(), 55, 12, 1517));
                break;
            case 6:
                C0047.m7777(C0040.m6663(this));
                C0034.m5978(C0032.m5708(m7515(), 44, 11, 1539));
                break;
            case 7:
                C0047.m7777(C0040.m6663(this));
                try {
                    int iM3103 = C0013.m3103(16);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                    FrameLayout frameLayout = new FrameLayout(C0022.m4453());
                    C0012.m2963(layoutParams, iM3103, iM3103, iM3103, iM3103);
                    TextView textView = new TextView(C0022.m4453());
                    C0042.m7106(textView, C0034.m6001(m7515(), 8, 23, 2242));
                    C0024.m4681(textView, 17);
                    C0039.m6563(textView, 12.0f);
                    C0041.m6790(frameLayout, textView, layoutParams);
                    Config.l = (ProgressDialog) C0019.m4124(C0047.m7798(C0003.m1403(C0047.m7848(C0036.m6223(new AlertDialog.Builder(C0022.m4453()), C0040.m6584(m7515(), 31, 9, 1739)), frameLayout), C0037.m6307(m7515(), 40, 2, 846), new b(0)), C0032.m5708(m7515(), 42, 2, 1485), new b(1)));
                    break;
                } catch (Exception unused) {
                    return;
                }
            case 8:
                C0045.m7653(C0040.m6663(this), C0013.m3106(m7515(), 6, 2, 990));
                break;
            case 9:
                C0045.m7653(C0040.m6663(this), C0014.m3332(m7515(), 4, 2, 1455));
                break;
            default:
                C0045.m7653(C0040.m6663(this), C0021.m4340(m7515(), 0, 4, 746));
                break;
        }
    }
}