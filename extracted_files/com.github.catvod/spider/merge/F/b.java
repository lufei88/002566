package com.github.catvod.spider.merge.F;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.TranslateAnimation;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.app.ActivityCompat;
import androidx.core.view.ViewKt;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.F0.C0163u;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.W.DialogInterfaceOnClickListenerC0226b;
import com.github.catvod.spider.merge.W.q;
import com.github.catvod.spider.merge.W.s;
import com.github.catvod.spider.merge.W.t;
import com.github.catvod.spider.merge.W.v;
import com.github.catvod.spider.merge.W.w;
import com.github.catvod.spider.merge.W.x;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.e0.C0288g;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.h0.C0314C;
import com.github.catvod.spider.merge.h0.M;
import com.github.catvod.spider.merge.h0.Q;
import com.github.catvod.spider.merge.h0.S;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.v0.InterfaceC0377a;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.util.Iterator;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f404short = {29850, 21976, 22480, 19332, 32654, 23831, 22476, 22565, 28952, -30453, 18985, 32216, -1233, -29248, 31778, -27615, 20523, 19309, 25604, -31522, -28771, 23844, 19956, 22897, 25019, 23718, -27144, 31579, -25875, -28783, 29663, 31318, 31157, -32346, 28444, 20993, 3238, 17027, 26604, -26618, 22391, 29663, 31318, 3239, 22176, 26878, 31168, 22658, 23178, 18142, 29396, 20557, 23190, 21887, 30248, 32673, 18291, 28802, 19767, 22962, 24952, 23653, -25104, 29523, -27931, -30823, 30275, 32714, 27264, 22429, 23241, 25751, 2189, 2282, 2282, 2282, 2282, 2282, 2282, 1775, 1786, 1786, 1786, 1786, 1786, 1786, 22916, -26028, 21868, 21504, 27264, 30021, 1547, 1616, 1622, 1600, 1623, 1611, 1604, 1608, 1600, 24303, 24451, 20563, 23151, -32083, -31031, 22591, 22115, 22287, 22751, 21219, 2420, 2420, 2420, 20725, -27867, 19721, 778, 778, 778, 22342, 26904, 22292, -27452, 21877, 24227, 21630, 24153, -30131, 1874, 1864, 1138, 1139, 1125, 3158, 3136, 2909, 2880, 2888, 2887, 2896, 2880, 2361, 2365, 2345, 2362, 2339, 1444, 1447, 1446, 3157, 3158, 3166, 3155, 3138, 985, 980, 977, 961, 973, 982};
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void a() {
        Q q = (Q) C0011.m2757(this);
        C0047.m7777(q);
        try {
            Application applicationM5652 = C0031.m5652();
            LinearLayout linearLayout = new LinearLayout(applicationM5652);
            C0032.m5684(linearLayout, 1);
            C0016.m3608(linearLayout, C0013.m3103(10), C0013.m3103(10), C0013.m3103(10), C0013.m3103(10));
            TextView textView = new TextView(applicationM5652);
            C0042.m7106(textView, C0036.m6188(m3795(), 0, 22, 1059));
            C0039.m6563(textView, 12.0f);
            C0026.m4878(textView, -7829368);
            C0024.m4681(textView, 17);
            C0017.m3709(textView, 0, 0, 0, C0013.m3103(10));
            C0037.m6336(linearLayout, textView);
            ScrollView scrollView = new ScrollView(applicationM5652);
            LinearLayout linearLayout2 = new LinearLayout(applicationM5652);
            q.d = linearLayout2;
            C0032.m5684(linearLayout2, 1);
            C0042.m7107(scrollView, C0037.m6377(q));
            FrameLayout frameLayout = new FrameLayout(applicationM5652);
            C0037.m6336(frameLayout, scrollView);
            C0030.m5348(frameLayout, C0013.m3103(250));
            C0037.m6336(linearLayout, frameLayout);
            C0045.m7633(q);
            C0008.m1998(q);
            Button button = new Button(applicationM5652);
            C0042.m7106(button, C0033.m5852(m3795(), 22, 4, 553));
            C0039.m6563(button, 12.0f);
            C0002.m1251(button, new M(q, 0));
            C0016.m3608(button, C0013.m3103(5), C0013.m3103(1), C0013.m3103(5), C0013.m3103(1));
            C0037.m6336(linearLayout, button);
            Button button2 = new Button(applicationM5652);
            C0042.m7106(button2, C0010.m2300(m3795(), 26, 4, 1077));
            C0039.m6563(button2, 12.0f);
            C0002.m1251(button2, new M(q, 1));
            C0016.m3608(button2, C0013.m3103(5), C0013.m3103(1), C0013.m3103(5), C0013.m3103(1));
            C0037.m6336(linearLayout, button2);
            AlertDialog alertDialogM7328 = C0043.m7328(C0003.m1403(C0047.m7848(C0036.m6223(new AlertDialog.Builder(C0022.m4453()), C0060.m9352(m3795(), 30, 14, 3214)), linearLayout), C0030.m5362(m3795(), 44, 2, 1398), new DialogInterfaceOnClickListenerC0226b(7, q)));
            q.b = alertDialogM7328;
            C0007.m1816(alertDialogM7328);
        } catch (Exception e) {
            C0038.m6402(C0036.m6261(e));
        }
    }

    private final void b() {
        Q q = (Q) C0011.m2757(this);
        C0047.m7777(q);
        try {
            Application applicationM5652 = C0031.m5652();
            LinearLayout linearLayout = new LinearLayout(applicationM5652);
            C0032.m5684(linearLayout, 1);
            C0016.m3608(linearLayout, C0013.m3103(10), C0013.m3103(10), C0013.m3103(10), C0013.m3103(10));
            TextView textView = new TextView(applicationM5652);
            C0042.m7106(textView, C0042.m7151(m3795(), 46, 12, 2425));
            C0039.m6563(textView, 14.0f);
            C0026.m4878(textView, -7829368);
            C0024.m4681(textView, 17);
            C0017.m3709(textView, 0, 0, 0, C0013.m3103(10));
            C0037.m6336(linearLayout, textView);
            ScrollView scrollView = new ScrollView(applicationM5652);
            LinearLayout linearLayout2 = new LinearLayout(applicationM5652);
            q.d = linearLayout2;
            C0032.m5684(linearLayout2, 1);
            C0042.m7107(scrollView, C0037.m6377(q));
            FrameLayout frameLayout = new FrameLayout(applicationM5652);
            C0037.m6336(frameLayout, scrollView);
            C0030.m5348(frameLayout, C0013.m3103(250));
            C0037.m6336(linearLayout, frameLayout);
            C0045.m7633(q);
            C0008.m1998(q);
            Button button = new Button(applicationM5652);
            C0042.m7106(button, C0003.m1398(m3795(), 58, 4, 746));
            C0039.m6563(button, 12.0f);
            C0002.m1251(button, new S(q, 0));
            C0016.m3608(button, C0013.m3103(5), C0013.m3103(1), C0013.m3103(5), C0013.m3103(1));
            C0037.m6336(linearLayout, button);
            Button button2 = new Button(applicationM5652);
            C0042.m7106(button2, C0018.m3917(m3795(), 62, 4, 3133));
            C0039.m6563(button2, 12.0f);
            C0002.m1251(button2, new S(q, 1));
            C0016.m3608(button2, C0013.m3103(5), C0013.m3103(1), C0013.m3103(5), C0013.m3103(1));
            C0037.m6336(linearLayout, button2);
            AlertDialog alertDialogM7328 = C0043.m7328(C0003.m1403(C0047.m7848(C0036.m6223(new AlertDialog.Builder(C0022.m4453()), C0035.m6131(m3795(), 66, 4, 2322)), linearLayout), C0045.m7657(m3795(), 70, 2, 2335), new DialogInterfaceOnClickListenerC0226b(8, q)));
            q.b = alertDialogM7328;
            C0007.m1816(alertDialogM7328);
        } catch (Exception e) {
            C0038.m6402(C0036.m6261(e));
        }
    }

    /* renamed from: ۣ۟۟ۥۧ, reason: not valid java name and contains not printable characters */
    public static void m3791(Object obj) {
        if (C0001.m1164() < 0) {
            ((b) obj).a();
        }
    }

    /* renamed from: ۣ۟ۤۢۢ, reason: not valid java name and contains not printable characters */
    public static void m3792(Object obj) {
        if (C0002.m1242() > 0) {
            ViewKt.a((InterfaceC0377a) obj);
        }
    }

    /* renamed from: ۣۢۥ۟, reason: not valid java name and contains not printable characters */
    public static void m3793(Object obj) {
        if (C0041.m6823() <= 0) {
            ActivityCompat.a((Activity) obj);
        }
    }

    /* renamed from: ۦۤۥ, reason: contains not printable characters */
    public static void m3794(Object obj) {
        if (C0051.m8216() <= 0) {
            ((b) obj).b();
        }
    }

    /* renamed from: ۣۨ۟ۤ, reason: not valid java name and contains not printable characters */
    public static short[] m3795() {
        if (C0059.m9257() <= 0) {
            return f404short;
        }
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (C0039.m6523(this)) {
            case 0:
                c cVar = (c) C0011.m2757(this);
                C0047.m7777(cVar);
                C0047.m7777(C0048.m7970());
                C0025.m4783(C0015.m3498(cVar), C0002.m1247(C0033.m5852(m3795(), 156, 6, 952)));
                break;
            case 1:
                com.github.catvod.spider.merge.H.a aVar = (com.github.catvod.spider.merge.H.a) C0011.m2757(this);
                C0047.m7777(aVar);
                C0047.m7777(C0055.m8709());
                C0025.m4783(C0044.m7423(aVar), C0002.m1247(C0046.m7718(m3795(), 151, 5, 3127)));
                break;
            case 2:
                com.github.catvod.spider.merge.K.a aVar2 = (com.github.catvod.spider.merge.K.a) C0011.m2757(this);
                C0047.m7777(aVar2);
                C0047.m7777(C0034.m6004());
                C0025.m4783(C0048.m7947(aVar2), C0002.m1247(C0063.m9585(m3795(), 148, 3, 1429)));
                break;
            case 3:
                com.github.catvod.spider.merge.L.a aVar3 = (com.github.catvod.spider.merge.L.a) C0011.m2757(this);
                C0047.m7777(aVar3);
                C0047.m7777(C0039.m6573());
                C0025.m4783(C0026.m4953(aVar3), C0002.m1247(C0027.m5062(m3795(), 143, 5, 2376)));
                break;
            case 4:
                com.github.catvod.spider.merge.N.a aVar4 = (com.github.catvod.spider.merge.N.a) C0011.m2757(this);
                C0047.m7777(aVar4);
                C0047.m7777(C0063.m9578());
                C0025.m4783(C0009.m2061(aVar4), C0002.m1247(C0003.m1398(m3795(), 137, 6, 2857)));
                break;
            case 5:
                com.github.catvod.spider.merge.O.a aVar5 = (com.github.catvod.spider.merge.O.a) C0011.m2757(this);
                C0047.m7777(aVar5);
                C0047.m7777(C0042.m7135());
                C0025.m4783(C0052.m8312(aVar5), C0002.m1247(C0010.m2300(m3795(), 135, 2, 3107)));
                break;
            case 6:
                com.github.catvod.spider.merge.P.a aVar6 = (com.github.catvod.spider.merge.P.a) C0011.m2757(this);
                C0047.m7777(aVar6);
                C0047.m7777(C0034.m5964());
                C0025.m4783(C0048.m7927(aVar6), C0002.m1247(C0019.m4107(m3795(), 132, 3, 1030)));
                break;
            case 7:
                x xVar = (x) C0011.m2757(this);
                C0047.m7777(xVar);
                try {
                    FrameLayout frameLayoutM1156 = C0001.m1156(xVar);
                    if (frameLayoutM1156 != null && C0030.m5434(frameLayoutM1156) != null) {
                        C0018.m3892((ViewGroup) C0030.m5434(C0001.m1156(xVar)), C0001.m1156(xVar));
                    }
                    xVar.d = null;
                    xVar.e = null;
                    xVar.f = null;
                    xVar.i = null;
                    C0011.m2786(C0026.m4899(xVar), null);
                    xVar.h = null;
                    Iterator itM1943 = C0008.m1943(C0031.m5639(C0004.m1575()));
                    while (C0012.m2962(itM1943)) {
                        if (!C0048.m7946((x) C0048.m7949(itM1943))) {
                            break;
                        }
                    }
                    WebView webViewM4750 = C0024.m4750();
                    if (webViewM4750 != null) {
                        com.github.catvod.spider.merge.W.n.d = C0056.m8873(webViewM4750);
                        C0044.m7396(C0024.m4750());
                        C0037.m6361(C0024.m4750(), null);
                        C0062.m9371(C0024.m4750(), null);
                        C0062.m9409(C0024.m4750());
                        com.github.catvod.spider.merge.W.n.a = null;
                        com.github.catvod.spider.merge.W.n.b = null;
                        break;
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            case 8:
                q qVar = (q) C0011.m2757(this);
                C0047.m7777(qVar);
                try {
                    FrameLayout frameLayoutM9342 = C0060.m9342(qVar);
                    if (frameLayoutM9342 != null && C0030.m5434(frameLayoutM9342) != null) {
                        C0018.m3892((ViewGroup) C0030.m5434(C0060.m9342(qVar)), C0060.m9342(qVar));
                    }
                    qVar.d = null;
                    qVar.e = null;
                    qVar.f = null;
                    qVar.i = null;
                    C0011.m2786(C0043.m7282(qVar), null);
                    qVar.h = null;
                    Iterator itM19432 = C0008.m1943(C0031.m5639(C0015.m3479()));
                    while (C0012.m2962(itM19432)) {
                        if (!C0028.m5191((q) C0048.m7949(itM19432))) {
                            break;
                        }
                    }
                    WebView webViewM8548 = C0054.m8548();
                    if (webViewM8548 != null) {
                        com.github.catvod.spider.merge.W.p.d = C0056.m8873(webViewM8548);
                        C0044.m7396(C0054.m8548());
                        C0037.m6361(C0054.m8548(), null);
                        C0062.m9371(C0054.m8548(), null);
                        C0062.m9409(C0054.m8548());
                        com.github.catvod.spider.merge.W.p.a = null;
                        com.github.catvod.spider.merge.W.p.b = null;
                        break;
                    }
                } catch (Exception unused2) {
                    return;
                }
                break;
            case 9:
                t tVar = (t) C0011.m2757(this);
                C0047.m7777(tVar);
                try {
                    FrameLayout frameLayoutM4481 = C0022.m4481(tVar);
                    if (frameLayoutM4481 != null && C0030.m5434(frameLayoutM4481) != null) {
                        C0018.m3892((ViewGroup) C0030.m5434(C0022.m4481(tVar)), C0022.m4481(tVar));
                    }
                    tVar.d = null;
                    tVar.e = null;
                    tVar.f = null;
                    tVar.i = null;
                    C0011.m2786(C0055.m8747(tVar), null);
                    tVar.h = null;
                    Iterator itM19433 = C0008.m1943(C0031.m5639(C0022.m4395()));
                    while (C0012.m2962(itM19433)) {
                        if (!C0016.m3609((t) C0048.m7949(itM19433))) {
                            break;
                        }
                    }
                    WebView webViewM4128 = C0019.m4128();
                    if (webViewM4128 != null) {
                        s.d = C0056.m8873(webViewM4128);
                        C0044.m7396(C0019.m4128());
                        C0037.m6361(C0019.m4128(), null);
                        C0062.m9371(C0019.m4128(), null);
                        C0062.m9409(C0019.m4128());
                        s.a = null;
                        s.b = null;
                        break;
                    }
                } catch (Exception unused3) {
                    return;
                }
                break;
            case 10:
                w wVar = (w) C0011.m2757(this);
                C0047.m7777(wVar);
                try {
                    FrameLayout frameLayoutM1196 = C0001.m1196(wVar);
                    if (frameLayoutM1196 != null && C0030.m5434(frameLayoutM1196) != null) {
                        C0018.m3892((ViewGroup) C0030.m5434(C0001.m1196(wVar)), C0001.m1196(wVar));
                    }
                    wVar.d = null;
                    wVar.e = null;
                    wVar.f = null;
                    wVar.i = null;
                    C0011.m2786(C0026.m4901(wVar), null);
                    wVar.h = null;
                    Iterator itM19434 = C0008.m1943(C0031.m5639(C0033.m5817()));
                    while (C0012.m2962(itM19434)) {
                        if (!C0016.m3520((w) C0048.m7949(itM19434))) {
                            break;
                        }
                    }
                    WebView webViewM2817 = C0011.m2817();
                    if (webViewM2817 != null) {
                        v.d = C0056.m8873(webViewM2817);
                        C0044.m7396(C0011.m2817());
                        C0037.m6361(C0011.m2817(), null);
                        C0062.m9371(C0011.m2817(), null);
                        C0062.m9409(C0011.m2817());
                        v.a = null;
                        v.b = null;
                        break;
                    }
                } catch (Exception unused4) {
                    return;
                }
                break;
            case 11:
                C0288g c0288g = (C0288g) C0011.m2757(this);
                if (C0013.m3158(c0288g) != null && !C0027.m5080(c0288g) && !C0018.m3972(C0047.m7849(C0055.m8766(c0288g)), C0032.m5687(c0288g))) {
                    C0040.m6677(C0013.m3158(c0288g));
                    break;
                }
                break;
            case 12:
                String str = (String) C0011.m2757(this);
                C0163u c0163uM7153 = C0042.m7153();
                if (!C0043.m7327(str)) {
                    Toast toast = (Toast) C0025.m4771(c0163uM7153);
                    if (toast != null) {
                        C0014.m3336(toast);
                    }
                    Toast toastM5249 = C0029.m5249(C0031.m5652(), str, 1);
                    c0163uM7153.a = toastM5249;
                    C0062.m9379(toastM5249);
                    break;
                }
                break;
            case 13:
                m3793((Activity) C0011.m2757(this));
                break;
            case 14:
                Button button = (Button) C0011.m2757(this);
                if (button != null && C0039.m6577(button)) {
                    C0041.m6789(button, true);
                    break;
                }
                break;
            case 15:
                com.github.catvod.spider.merge.h0.x xVar2 = (com.github.catvod.spider.merge.h0.x) C0011.m2757(this);
                C0047.m7777(xVar2);
                String strM6307 = C0037.m6307(m3795(), 72, 7, 2222);
                String strM9106 = C0058.m9106(m3795(), 79, 7, 1740);
                try {
                    com.github.catvod.spider.merge.h0.w wVar2 = new com.github.catvod.spider.merge.h0.w(xVar2, C0031.m5652());
                    C0016.m3608(wVar2, C0013.m3103(16), C0013.m3103(16), C0013.m3103(16), C0013.m3103(0));
                    C0019.m4040(wVar2);
                    LinearLayout linearLayout = new LinearLayout(C0031.m5652());
                    C0032.m5684(linearLayout, 1);
                    C0009.m2112(linearLayout, new LinearLayout.LayoutParams(-1, -2));
                    TextView textView = new TextView(C0031.m5652());
                    C0042.m7106(textView, C0028.m5109(m3795(), 86, 4, 2645));
                    C0039.m6563(textView, 18.0f);
                    C0026.m4878(textView, -16777216);
                    C0017.m3709(textView, 0, 0, 0, C0013.m3103(16));
                    C0024.m4681(textView, 17);
                    C0037.m6336(linearLayout, textView);
                    LinearLayout linearLayout2 = new LinearLayout(C0031.m5652());
                    C0032.m5684(linearLayout2, 1);
                    C0009.m2112(linearLayout2, new LinearLayout.LayoutParams(-1, -2));
                    C0016.m3608(linearLayout2, 0, 0, 0, C0013.m3103(12));
                    TextView textView2 = new TextView(C0031.m5652());
                    C0042.m7106(textView2, C0055.m8814(m3795(), 90, 2, 3253));
                    C0039.m6563(textView2, 14.0f);
                    C0026.m4878(textView2, C0000.m1044(strM9106));
                    C0017.m3709(textView2, 0, 0, 0, C0013.m3103(4));
                    C0037.m6336(linearLayout2, textView2);
                    EditText editText = new EditText(C0031.m5652());
                    xVar2.b = editText;
                    C0042.m7106(editText, C0045.m7609(C0045.m7657(m3795(), 92, 9, 1573)));
                    C0039.m6563(C0022.m4463(xVar2), 15.0f);
                    C0026.m4878(C0022.m4463(xVar2), -16777216);
                    C0016.m3608(C0022.m4463(xVar2), C0013.m3103(12), C0013.m3103(10), C0013.m3103(12), C0013.m3103(10));
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    C0036.m6222(gradientDrawable, -1);
                    C0029.m5216(gradientDrawable, C0013.m3103(6));
                    C0065.m9713(gradientDrawable, C0013.m3103(1), C0000.m1044(strM6307));
                    C0018.m3985(C0022.m4463(xVar2), gradientDrawable);
                    C0037.m6336(linearLayout2, C0022.m4463(xVar2));
                    C0037.m6336(linearLayout, linearLayout2);
                    LinearLayout linearLayout3 = new LinearLayout(C0031.m5652());
                    C0032.m5684(linearLayout3, 1);
                    C0009.m2112(linearLayout3, new LinearLayout.LayoutParams(-1, -2));
                    C0016.m3608(linearLayout3, 0, 0, 0, C0013.m3103(20));
                    TextView textView3 = new TextView(C0031.m5652());
                    C0042.m7106(textView3, C0006.m1774(m3795(), 101, 4, 470));
                    C0039.m6563(textView3, 14.0f);
                    C0026.m4878(textView3, C0000.m1044(strM9106));
                    C0017.m3709(textView3, 0, 0, 0, C0013.m3103(4));
                    C0037.m6336(linearLayout3, textView3);
                    EditText editText2 = new EditText(C0031.m5652());
                    xVar2.c = editText2;
                    C0009.m2052(editText2, C0038.m6452(m3795(), 105, 10, 2394));
                    C0039.m6563(C0043.m7315(xVar2), 15.0f);
                    C0026.m4878(C0043.m7315(xVar2), -16777216);
                    C0016.m3608(C0043.m7315(xVar2), C0013.m3103(12), C0013.m3103(10), C0013.m3103(12), C0013.m3103(10));
                    C0011.m2821(C0043.m7315(xVar2), 3);
                    C0053.m8415(C0043.m7315(xVar2), 5);
                    C0023.m4590(C0043.m7315(xVar2), false);
                    GradientDrawable gradientDrawable2 = new GradientDrawable();
                    C0036.m6222(gradientDrawable2, -1);
                    C0029.m5216(gradientDrawable2, C0013.m3103(6));
                    C0065.m9713(gradientDrawable2, C0013.m3103(1), C0000.m1044(strM6307));
                    C0018.m3985(C0043.m7315(xVar2), gradientDrawable2);
                    C0037.m6336(linearLayout3, C0043.m7315(xVar2));
                    C0037.m6336(linearLayout, linearLayout3);
                    LinearLayout linearLayout4 = new LinearLayout(C0031.m5652());
                    xVar2.d = linearLayout4;
                    C0032.m5684(linearLayout4, 0);
                    C0014.m3381(C0047.m7815(xVar2), 17);
                    C0016.m3608(C0047.m7815(xVar2), 0, C0013.m3103(20), 0, C0013.m3103(20));
                    C0010.m2319(C0047.m7815(xVar2), 8);
                    ProgressBar progressBar = new ProgressBar(C0031.m5652());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C0013.m3103(24), C0013.m3103(24));
                    layoutParams.rightMargin = C0013.m3103(8);
                    C0009.m2112(progressBar, layoutParams);
                    TextView textView4 = new TextView(C0031.m5652());
                    C0042.m7106(textView4, C0054.m8574(m3795(), 115, 6, 804));
                    C0039.m6563(textView4, 14.0f);
                    C0026.m4878(textView4, -7829368);
                    C0037.m6336(C0047.m7815(xVar2), progressBar);
                    C0037.m6336(C0047.m7815(xVar2), textView4);
                    C0037.m6336(linearLayout, C0047.m7815(xVar2));
                    C0037.m6336(wVar2, linearLayout);
                    AlertDialog alertDialogM7328 = C0043.m7328(C0047.m7798(C0003.m1403(C0047.m7848(new AlertDialog.Builder(C0022.m4453()), wVar2), C0005.m1645(m3795(), 121, 2, 1168), new DialogInterfaceOnClickListenerC0226b(5, xVar2)), C0024.m4740(m3795(), 123, 2, 1221), null));
                    xVar2.a = alertDialogM7328;
                    C0051.m8276(alertDialogM7328, new com.github.catvod.spider.merge.h0.v(0, xVar2));
                    C0007.m1816(C0039.m6522(xVar2));
                    C0004.m1487(xVar2);
                    View viewM3365 = C0014.m3365(C0000.m1119(C0039.m6522(xVar2)));
                    TranslateAnimation translateAnimation = new TranslateAnimation(2, 0.0f, 2, 0.0f, 2, 1.0f, 2, 0.0f);
                    C0044.m7401(translateAnimation, 300L);
                    C0033.m5846(translateAnimation, true);
                    C0063.m9549(viewM3365, translateAnimation);
                    break;
                } catch (Exception e) {
                    C0049.m7975(e);
                    StringBuilder sb = new StringBuilder(C0026.m4951(m3795(), 125, 7, 1896));
                    C0018.m3933(sb, C0036.m6261(e));
                    C0038.m6402(C0047.m7763(sb));
                    return;
                }
            case 16:
                C0314C c0314c = (C0314C) C0011.m2757(this);
                c0314c.i = true;
                C0009.m2114(C0023.m4567(c0314c), 150);
                C0021.m4361(c0314c);
                break;
            case 17:
                m3791(this);
                break;
            case 18:
                m3794(this);
                break;
            default:
                m3792((InterfaceC0377a) C0011.m2757(this));
                break;
        }
    }
}