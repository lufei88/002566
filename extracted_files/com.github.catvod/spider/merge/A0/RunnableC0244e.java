package com.github.catvod.spider.merge.a0;

import android.R;
import android.app.AlertDialog;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.W.DialogInterfaceOnClickListenerC0226b;
import com.github.catvod.spider.merge.W.DialogInterfaceOnClickListenerC0227c;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.github.catvod.spider.merge.a0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0244e implements Runnable {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f720short = {2620, 2592, 2592, 2596, 2599, 2670, 2683, 2683, 2596, 2613, 2599, 2599, 2596, 2619, 2598, 2592, 2682, 2613, 2616, 2621, 2605, 2593, 2618, 2608, 2598, 2621, 2594, 2609, 2682, 2615, 2619, 2617, 2683, 2618, 2609, 2595, 2616, 2619, 2611, 2621, 2618, 2683, 2597, 2598, 2615, 2619, 2608, 2609, 2683, 2611, 2609, 2618, 2609, 2598, 2613, 2592, 2609, 2682, 2608, 2619, 2667, 2613, 2596, 2596, 2586, 2613, 2617, 2609, 2665, 2613, 2616, 2621, 2605, 2593, 2618, 2571, 2608, 2598, 2621, 2594, 2609, 2674, 2610, 2598, 2619, 2617, 2567, 2621, 2592, 2609, 2665, 2657, 2662, 2674, 2613, 2596, 2596, 2586, 2613, 2617, 2609, 2665, 2613, 2616, 2621, 2605, 2593, 2618, 2571, 2608, 2598, 2621, 2594, 2609, 2674, 2613, 2596, 2596, 2577, 2618, 2592, 2598, 2613, 2618, 2615, 2609, 2665, 2595, 2609, 2614, 2674, 2621, 2599, 2585, 2619, 2614, 2621, 2616, 2609, 2665, 2610, 2613, 2616, 2599, 2609, 2674, 2616, 2613, 2618, 2611, 2665, 2606, 2620, 2571, 2583, 2586, 2674, 2598, 2609, 2592, 2593, 2598, 2618, 2561, 2598, 2616, 2665, 2674, 2614, 2621, 2606, 2564, 2613, 2598, 2613, 2617, 2599, 2665, 2674, 2571, 2614, 2604, 2681, 2594, 2665, 2662, 2682, 2662, 2682, 2663, -31862, -31111, 22564, 2325, 2350, 2346, 2340, 2351, 2668, 2671, 2686, 2642, 2649, 2648, 2352, 2321, 2328, 2321, 2304, 2321, 2394, 2394, 2394, 1870, 1815, 1863, 1872, 1860, 1856, 1872, 1862, 1857, 1862, 1815, 1807, 1902, 1870, 1815, 1879, 1882, 1873, 1868, 1815, 1807, 1870, 1815, 1873, 1863, 1884, 1859, 1872, 1898, 1884, 1873, 1815, 1807, 1815, 1579, 1573, 1579, 1647, 1632, 1637, 1644, 1622, 1632, 1645, 1579, 1587, 1579, 3235, 3324, 3245, 3235, 3305, 3300, 3296, 3301, 3300, 3315, 3314, 3235, 3259, 3322, 3235, 3266, 3310, 3311, 3317, 3300, 3311, 3317, 3244, 3285, 3320, 3313, 3300, 3235, 3259, 3235, 3296, 3313, 3313, 3309, 3304, 3298, 3296, 3317, 3304, 3310, 3311, 3246, 3307, 3314, 3310, 3311, 3235, 3324, 3245, 3235, 3304, 3301, 3235, 3259, 3235, 1888, 1902, 1888, 1839, 1831, 1846, 1834, 1837, 1830, 1888, 1912, 1888, 1810, 1805, 1809, 1814, 1888, 1902, 1888, 1847, 1840, 1838, 1888, 1912, 1888, 1901, 1828, 1835, 1838, 1831, 1901, 1830, 1831, 1838, 1831, 1846, 1831, 1888, 1855, 1823, 1902, 1888, 1840, 1831, 1841, 1837, 1847, 1840, 1825, 1831, 1888, 1912, 1888, 1828, 1835, 1838, 1831, 1888, 1855, 3307, 3310, 3320, 3299, 3324, 3311, 3237, 3324, 3256, 3237, 3304, 3307, 3326, 3305, 3298};
    public final /* synthetic */ int a;
    public final /* synthetic */ C0246g b;

    public /* synthetic */ RunnableC0244e(C0246g c0246g, int i) {
        this.a = i;
        this.b = c0246g;
    }

    /* renamed from: ۟۟۟ۢۡ, reason: not valid java name and contains not printable characters */
    public static void m6972(Object obj) {
        if (C0033.m5872() > 0) {
            SpiderDebug.log((String) obj);
        }
    }

    /* renamed from: ۣۨۥۢ, reason: not valid java name and contains not printable characters */
    public static short[] m6973() {
        if (C0016.m3596() < 0) {
            return f720short;
        }
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (C0044.m7490(this)) {
            case 0:
                C0246g c0246gM4602 = C0023.m4602(this);
                C0047.m7777(c0246gM4602);
                ArrayList arrayList = (ArrayList) C0014.m3390(c0246gM4602);
                Iterator itM7816 = C0047.m7816(new ArrayList(arrayList));
                while (C0012.m2962(itM7816)) {
                    String str = (String) C0048.m7949(itM7816);
                    StringBuilder sb = new StringBuilder(C0021.m4340(m6973(), 204, 9, 2420));
                    C0018.m3933(sb, str);
                    m6972(C0047.m7763(sb));
                    if (C0032.m5735(C0019.m4108((com.github.catvod.spider.merge.F.n) C0033.m5856(C0031.m5630(c0246gM4602, C0047.m7833(m6973(), 374, 15, 3210), C0028.m5188(C0052.m8368(C0029.m5256(m6973(), 213, 34, 1845), C0027.m5059(C0036.m6172((com.github.catvod.spider.merge.F.c) C0022.m4433(c0246gM4602))), C0033.m5852(m6973(), 247, 13, 1545), str, C0026.m4951(m6973(), 260, 55, 3201)), str, C0004.m1549(m6973(), 315, 59, 1858)), true), com.github.catvod.spider.merge.F.n.class))) == 404) {
                        C0040.m6616(arrayList, str);
                    }
                }
                break;
            case 1:
                C0054.m8579(C0023.m4602(this));
                break;
            case 2:
                C0246g c0246gM46022 = C0023.m4602(this);
                C0047.m7777(c0246gM46022);
                try {
                    int iM3103 = C0013.m3103(16);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                    FrameLayout frameLayout = new FrameLayout(C0031.m5652());
                    C0012.m2963(layoutParams, iM3103, iM3103, iM3103, iM3103);
                    EditText editText = new EditText(C0031.m5652());
                    C0041.m6790(frameLayout, editText, layoutParams);
                    c0246gM46022.d = C0019.m4124(C0049.m8029(C0030.m5442(C0020.m4201(C0047.m7848(C0036.m6223(new AlertDialog.Builder(C0022.m4453()), C0006.m1774(m6973(), 190, 8, 2369)), frameLayout), C0018.m3917(m6973(), 198, 6, 2621), new DialogInterfaceOnClickListenerC0226b(1, c0246gM46022)), R.string.cancel, null), R.string.ok, new DialogInterfaceOnClickListenerC0227c(c0246gM46022, editText, 1)));
                    break;
                } catch (Exception unused) {
                    return;
                }
            default:
                C0246g c0246gM46023 = C0023.m4602(this);
                C0047.m7777(c0246gM46023);
                String strM5769 = C0032.m5769(C0030.m5362(m6973(), 0, 190, 2644), null);
                C0016.m3575(new com.github.catvod.spider.merge.W.i(c0246gM46023, strM5769, C0017.m3713(C0065.m9759(C0057.m8959(strM5769))), 5));
                break;
        }
    }
}