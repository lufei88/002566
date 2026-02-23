package com.github.catvod.spider.merge.Y;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.webkit.WebBackForwardList;
import android.widget.Button;
import androidx.core.internal.view.SupportMenuItem;
import com.github.catvod.spider.HBDmSou;
import com.github.catvod.spider.HBPguo;
import com.github.catvod.spider.HBgetapp;
import com.github.catvod.spider.HBhcShun;
import com.github.catvod.spider.HBmoou;
import com.github.catvod.spider.Market;
import com.github.catvod.spider.Star;
import com.github.catvod.spider.UpYun;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.D.f;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.F0.C0144a;
import com.github.catvod.spider.merge.F0.C0148e;
import com.github.catvod.spider.merge.F0.C0150g;
import com.github.catvod.spider.merge.G0.d;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.B;
import com.github.catvod.spider.merge.P0.C;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.P0.E;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.T0.m;
import com.github.catvod.spider.merge.T0.p;
import com.github.catvod.spider.merge.T0.r;
import com.github.catvod.spider.merge.U0.C0174a;
import com.github.catvod.spider.merge.U0.C0176b;
import com.github.catvod.spider.merge.U0.O;
import com.github.catvod.spider.merge.U0.P;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.V.c;
import com.github.catvod.spider.merge.V0.h;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.W.DialogInterfaceOnClickListenerC0226b;
import com.github.catvod.spider.merge.W.i;
import com.github.catvod.spider.merge.W.s;
import com.github.catvod.spider.merge.X0.C0230a;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0246g;
import com.github.catvod.spider.merge.a0.C0254o;
import com.github.catvod.spider.merge.a0.M;
import com.github.catvod.spider.merge.a0.ViewOnClickListenerC0260v;
import com.github.catvod.spider.merge.a0.W;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d.C0266a;
import com.github.catvod.spider.merge.d.C0268c;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.e.C0273c;
import com.github.catvod.spider.merge.e.C0280j;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.g0.g;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.h0.AbstractC0334n;
import com.github.catvod.spider.merge.h0.C0332l;
import com.github.catvod.spider.merge.h0.C0335o;
import com.github.catvod.spider.merge.h0.RunnableC0316E;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.AbstractC0412b;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.S.j;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.d.e;
import com.github.catvod.spider.p000mergexbpq.d0.F;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.PublicKey;
import java.text.Normalizer;
import java.text.ParsePosition;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: com.github.catvod.spider.merge.Y.ۡۡۦۡ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0035 {

    /* renamed from: ۣۦۡۨ, reason: not valid java name and contains not printable characters */
    public static int f685 = -399;

    /* renamed from: ۟۟۟۟ۥ, reason: not valid java name and contains not printable characters */
    public static E m6072() {
        if (C0053.m8389() > 0) {
            return C.b;
        }
        return null;
    }

    /* renamed from: ۟۟ۢۡ, reason: not valid java name and contains not printable characters */
    public static String m6073() {
        if (C0033.m5872() > 0) {
            return System.lineSeparator();
        }
        return null;
    }

    /* renamed from: ۣ۟۟ۡۨ, reason: not valid java name and contains not printable characters */
    public static boolean m6074(Object obj) {
        if (C0040.m6582() >= 0) {
            return ((d) obj).d;
        }
        return false;
    }

    /* renamed from: ۟۟ۤۢۢ, reason: not valid java name and contains not printable characters */
    public static HashMap m6075() {
        if (C0061.m9359() <= 0) {
            return HBPguo.a();
        }
        return null;
    }

    /* renamed from: ۟۟ۥ۠ۥ, reason: not valid java name and contains not printable characters */
    public static void m6076(Object obj, Object obj2) {
        if (C0009.m2047() >= 0) {
            ((ShortcutManager) obj).enableShortcuts((List) obj2);
        }
    }

    /* renamed from: ۟۟ۥۦۧ, reason: not valid java name and contains not printable characters */
    public static boolean m6077(Object obj, Object obj2) {
        if (C0016.m3596() < 0) {
            return ((HashSet) obj).contains(obj2);
        }
        return false;
    }

    /* renamed from: ۟۟ۦۨۧ, reason: not valid java name and contains not printable characters */
    public static int m6078(int i) {
        if (C0053.m8389() >= 0) {
            return com.github.catvod.spider.p000mergexbpq.l.a.a(i);
        }
        return 0;
    }

    /* renamed from: ۣ۟۟ۧۧ, reason: not valid java name and contains not printable characters */
    public static String m6079(Object obj) {
        if (C0033.m5872() >= 0) {
            return ((C0332l) obj).b;
        }
        return null;
    }

    /* renamed from: ۟۠۠ۡۡ, reason: not valid java name and contains not printable characters */
    public static String m6080(Object obj, Object obj2) {
        if (C0021.m4379() >= 0) {
            return UpYun.b((String) obj, (String) obj2);
        }
        return null;
    }

    /* renamed from: ۣ۟۠ۢ۟, reason: not valid java name and contains not printable characters */
    public static c m6081(Object obj) {
        if (m6140() <= 0) {
            return ((HBDmSou) obj).f;
        }
        return null;
    }

    /* renamed from: ۣۣ۟۠ۧ, reason: not valid java name and contains not printable characters */
    public static int m6082(Object obj) {
        if (C0037.m6350() < 0) {
            return ((C0148e) obj).hashCode();
        }
        return 0;
    }

    /* renamed from: ۟۠ۤۡ۟, reason: not valid java name and contains not printable characters */
    public static String m6083(Object obj) {
        if (C0029.m5282() >= 0) {
            return ((com.github.catvod.spider.merge.J.c) obj).a();
        }
        return null;
    }

    /* renamed from: ۟۠ۤۦ۟, reason: not valid java name and contains not printable characters */
    public static SupportMenuItem m6084(Object obj, Object obj2) {
        if (C0000.m1116() < 0) {
            return ((SupportMenuItem) obj).setContentDescription((CharSequence) obj2);
        }
        return null;
    }

    /* renamed from: ۟۠ۧۦۡ, reason: not valid java name and contains not printable characters */
    public static C0174a m6085(Object obj) {
        if (C0037.m6350() <= 0) {
            return ((C0176b) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۡ۠ۥۦ, reason: not valid java name and contains not printable characters */
    public static void m6086(Object obj, Object obj2) {
        if (C0049.m8038() < 0) {
            ((m) obj).x((r) obj2);
        }
    }

    /* renamed from: ۟ۡ۠ۦۣ, reason: not valid java name and contains not printable characters */
    public static PrintStream m6087() {
        if (C0001.m1164() <= 0) {
            return System.out;
        }
        return null;
    }

    /* renamed from: ۟ۡۢۥۡ, reason: not valid java name and contains not printable characters */
    public static String m6088(Object obj) {
        if (C0025.m4797() >= 0) {
            return ((com.github.catvod.spider.merge.b0.d) obj).e;
        }
        return null;
    }

    /* renamed from: ۟ۡۧۡۢ, reason: not valid java name and contains not printable characters */
    public static String m6089(Object obj, Object obj2) {
        if (C0017.m3633() < 0) {
            return Normalizer.normalize((CharSequence) obj, (Normalizer.Form) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۡۧۤۨ, reason: not valid java name and contains not printable characters */
    public static Object m6090(Object obj) {
        if (C0034.m6048() <= 0) {
            return ((ViewOnClickListenerC0260v) obj).b;
        }
        return null;
    }

    /* renamed from: ۣ۟ۡۨۧ, reason: not valid java name and contains not printable characters */
    public static void m6091(Object obj, int i) {
        if (C0026.m4977() <= 0) {
            ((ParsePosition) obj).setErrorIndex(i);
        }
    }

    /* renamed from: ۣ۟ۡۨۨ, reason: not valid java name and contains not printable characters */
    public static String m6092(Object obj) {
        if (C0008.m1975() >= 0) {
            return ((e) obj).b();
        }
        return null;
    }

    /* renamed from: ۣ۟ۢۡ۠, reason: not valid java name and contains not printable characters */
    public static WindowManager m6093(Object obj) {
        if (C0022.m4497() >= 0) {
            return ((Activity) obj).getWindowManager();
        }
        return null;
    }

    /* renamed from: ۟ۢۡۨۢ, reason: not valid java name and contains not printable characters */
    public static Paint m6094(Object obj) {
        if (C0015.m3433() >= 0) {
            return ((ShapeDrawable) obj).getPaint();
        }
        return null;
    }

    /* renamed from: ۟ۢۢ۠ۨ, reason: not valid java name and contains not printable characters */
    public static Charset m6095() {
        if (C0005.m1599() <= 0) {
            return StandardCharsets.UTF_16BE;
        }
        return null;
    }

    /* renamed from: ۣ۟ۢۢ۟, reason: not valid java name and contains not printable characters */
    public static void m6096(Object obj) throws IOException {
        if (C0044.m7508() <= 0) {
            ((Socket) obj).close();
        }
    }

    /* renamed from: ۣ۟ۢۨۤ, reason: not valid java name and contains not printable characters */
    public static String m6097() {
        if (C0028.m5152() < 0) {
            return "Mozilla/5.0 (Linux; Android 11; Ghxi Build/RKQ1.200826.002; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/76.0.3809.89 Mobile Safari/537.36";
        }
        return null;
    }

    /* renamed from: ۟ۢۥ۠ۤ, reason: not valid java name and contains not printable characters */
    public static Object m6098(Object obj) {
        if (C0023.m4566() <= 0) {
            return ((i) obj).b;
        }
        return null;
    }

    /* renamed from: ۣۣ۟۟۟, reason: not valid java name and contains not printable characters */
    public static String m6099() {
        if (C0025.m4797() > 0) {
            return "u0";
        }
        return null;
    }

    /* renamed from: ۣ۟۠ۢۤ, reason: not valid java name and contains not printable characters */
    public static void m6100(boolean z) {
        if (C0062.m9429() > 0) {
            C0150g.a(z);
        }
    }

    /* renamed from: ۣ۟ۡۨۤ, reason: not valid java name and contains not printable characters */
    public static Context m6101(Object obj) {
        if (C0012.m3024() > 0) {
            return ((Context) obj).getApplicationContext();
        }
        return null;
    }

    /* renamed from: ۣ۟ۥۧۦ, reason: not valid java name and contains not printable characters */
    public static String m6102(Object obj) {
        if (C0001.m1164() < 0) {
            return ((Locale) obj).getCountry();
        }
        return null;
    }

    /* renamed from: ۣ۟ۧۥ۟, reason: not valid java name and contains not printable characters */
    public static boolean m6103(Object obj) {
        if (C0059.m9257() < 0) {
            return ((M) obj).b;
        }
        return false;
    }

    /* renamed from: ۟ۤۡۡۡ, reason: not valid java name and contains not printable characters */
    public static Pattern m6104(Object obj) {
        if (C0025.m4797() >= 0) {
            return ((h) obj).b;
        }
        return null;
    }

    /* renamed from: ۣ۟ۤۡ, reason: not valid java name and contains not printable characters */
    public static boolean m6105(Object obj) {
        if (C0054.m8557() <= 0) {
            return ((f) obj).c;
        }
        return false;
    }

    /* renamed from: ۟ۤۤ۠, reason: not valid java name and contains not printable characters */
    public static Intent m6106(Object obj, int i) {
        if (C0048.m7971() > 0) {
            return ((Intent) obj).addFlags(i);
        }
        return null;
    }

    /* renamed from: ۟ۤۧ۠۟, reason: not valid java name and contains not printable characters */
    public static boolean m6107(Object obj, Object obj2) {
        if (C0040.m6582() >= 0) {
            return ((Collection) obj).contains(obj2);
        }
        return false;
    }

    /* renamed from: ۟ۤۨۦ۟, reason: not valid java name and contains not printable characters */
    public static String m6108() {
        if (C0058.m9131() <= 0) {
            return "clan://localhost/";
        }
        return null;
    }

    /* renamed from: ۟ۥۣ۟۟, reason: not valid java name and contains not printable characters */
    public static int m6109(Object obj) {
        if (C0011.m2755() > 0) {
            return ((AccessibilityNodeInfo) obj).getInputType();
        }
        return 0;
    }

    /* renamed from: ۟ۥۤ۠, reason: not valid java name and contains not printable characters */
    public static f m6110() {
        if (C0052.m8320() > 0) {
            return com.github.catvod.spider.merge.D.e.a;
        }
        return null;
    }

    /* renamed from: ۟ۥۦۧۨ, reason: not valid java name and contains not printable characters */
    public static HashMap m6111() {
        if (C0024.m4693() < 0) {
            return com.github.catvod.spider.merge.U0.E.j;
        }
        return null;
    }

    /* renamed from: ۟ۥۦۨۥ, reason: not valid java name and contains not printable characters */
    public static String m6112(Object obj) {
        if (C0047.m7837() >= 0) {
            return ((O) obj).l();
        }
        return null;
    }

    /* renamed from: ۟ۥۧۤۢ, reason: not valid java name and contains not printable characters */
    public static char m6113(Object obj) {
        if (C0015.m3433() >= 0) {
            return ((CharBuffer) obj).get();
        }
        return (char) 0;
    }

    /* renamed from: ۟ۥۨۢۢ, reason: not valid java name and contains not printable characters */
    public static void m6114(Object obj, int i) {
        if (C0020.m4210() <= 0) {
            ((Canvas) obj).restoreToCount(i);
        }
    }

    /* renamed from: ۟ۦ۠ۡۦ, reason: not valid java name and contains not printable characters */
    public static void m6115(Object obj) {
        if (C0029.m5282() > 0) {
            ((C0254o) obj).p();
        }
    }

    /* renamed from: ۟ۦ۠ۢۦ, reason: not valid java name and contains not printable characters */
    public static void m6116(Object obj) {
        if (C0012.m3024() >= 0) {
            ((com.github.catvod.spider.merge.W.C) obj).a();
        }
    }

    /* renamed from: ۟ۧ۠ۤ۠, reason: not valid java name and contains not printable characters */
    public static int m6117(Object obj) {
        if (C0037.m6350() < 0) {
            return ((com.github.catvod.spider.merge.S0.a) obj).a;
        }
        return 0;
    }

    /* renamed from: ۟ۧ۠ۦۤ, reason: not valid java name and contains not printable characters */
    public static int m6118(Object obj) {
        if (C0054.m8557() <= 0) {
            return ((d) obj).a;
        }
        return 0;
    }

    /* renamed from: ۟ۧۡۥۢ, reason: not valid java name and contains not printable characters */
    public static void m6119(Object obj) {
        if (C0029.m5282() >= 0) {
            ((M) obj).r();
        }
    }

    /* renamed from: ۣ۟ۧۢ۟, reason: not valid java name and contains not printable characters */
    public static boolean m6120(Object obj) {
        if (C0041.m6823() <= 0) {
            return ((F) obj).d();
        }
        return false;
    }

    /* renamed from: ۣ۟ۧۥ, reason: not valid java name and contains not printable characters */
    public static String m6121() {
        if (C0039.m6529() <= 0) {
            return "Headers";
        }
        return null;
    }

    /* renamed from: ۟ۨۤۧ, reason: not valid java name and contains not printable characters */
    public static Locale m6122(Object obj) {
        if (C0034.m6048() <= 0) {
            return ((B) obj).c;
        }
        return null;
    }

    /* renamed from: ۣ۠ۤۤ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.p000mergexbpq.c0.r m6123(Object obj, Object obj2, Object obj3) {
        if (C0056.m8886() < 0) {
            return ((com.github.catvod.spider.p000mergexbpq.c0.r) obj).b((String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۣ۠ۧ, reason: not valid java name and contains not printable characters */
    public static String m6124(Object obj) {
        if (C0040.m6582() >= 0) {
            return ((HBmoou) obj).f;
        }
        return null;
    }

    /* renamed from: ۠ۧۥ, reason: not valid java name and contains not printable characters */
    public static boolean m6125(Object obj) {
        if (C0055.m8740() > 0) {
            return ((com.github.catvod.spider.merge.d0.d) obj).m;
        }
        return false;
    }

    /* renamed from: ۠ۧۦ۟, reason: not valid java name and contains not printable characters */
    public static C0144a m6126() {
        if (C0036.m6252() >= 0) {
            return C0230a.t;
        }
        return null;
    }

    /* renamed from: ۡ۠ۨۦ, reason: not valid java name and contains not printable characters */
    public static String m6127(String str) {
        String string = "";
        int i = 0;
        String str2 = "";
        while (i < 15) {
            string = new StringBuffer().append(string).append(Integer.toHexString(i)).toString();
            String string2 = new StringBuffer().append(str2).append(((int) (Math.random() * 10)) ^ i).toString();
            i++;
            str2 = string2;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length() / 2);
        for (int i2 = 0; i2 < str.length(); i2 += 2) {
            byteArrayOutputStream.write((string.indexOf(str.charAt(i2)) << 4) | string.indexOf(str.charAt(i2 + 1)));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        int length2 = str2.length();
        while (length > 0) {
            byteArray[-1] = (byte) (byteArray[-1] ^ str2.charAt((-1) % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* renamed from: ۣۡۢۤ, reason: not valid java name and contains not printable characters */
    public static boolean m6128(Object obj, int i) {
        if (C0018.m3956() >= 0) {
            return ((WindowInsets) obj).isVisible(i);
        }
        return false;
    }

    /* renamed from: ۡۤۦۣ, reason: not valid java name and contains not printable characters */
    public static p m6129(Object obj) {
        if (C0001.m1164() <= 0) {
            return ((C0176b) obj).p;
        }
        return null;
    }

    /* renamed from: ۡۥۣۦ, reason: not valid java name and contains not printable characters */
    public static Market m6130(Object obj) {
        if (C0030.m5375() > 0) {
            return ((com.github.catvod.spider.merge.b0.m) obj).b;
        }
        return null;
    }

    /* renamed from: ۡۨۢۡ, reason: not valid java name and contains not printable characters */
    public static boolean m6132(Object obj) {
        if (C0025.m4797() >= 0) {
            return ((List) obj).isEmpty();
        }
        return false;
    }

    /* renamed from: ۣۣۢۡ, reason: not valid java name and contains not printable characters */
    public static String m6133(Object obj) {
        if (C0027.m5017() >= 0) {
            return g.g((String) obj);
        }
        return null;
    }

    /* renamed from: ۢۤۥۢ, reason: not valid java name and contains not printable characters */
    public static int m6134(Object obj) {
        if (C0039.m6529() <= 0) {
            return ((AbstractC0412b) obj).b;
        }
        return 0;
    }

    /* renamed from: ۢۤۧ۟, reason: not valid java name and contains not printable characters */
    public static void m6135(Object obj, Object obj2) {
        if (C0030.m5375() >= 0) {
            ((Window) obj).setBackgroundDrawable((Drawable) obj2);
        }
    }

    /* renamed from: ۣۡۢۤ, reason: not valid java name and contains not printable characters */
    public static String m6136(Object obj) {
        if (C0022.m4497() > 0) {
            return com.github.catvod.spider.merge.B.m.b((String) obj);
        }
        return null;
    }

    /* renamed from: ۣۢۢۨ, reason: not valid java name and contains not printable characters */
    public static int m6137(Object obj) {
        if (C0051.m8216() <= 0) {
            return ((ShortcutInfo) obj).getRank();
        }
        return 0;
    }

    /* renamed from: ۣۤۤۧ, reason: not valid java name and contains not printable characters */
    public static String m6138() {
        if (C0043.m7332() >= 0) {
            return " \n      </div>\n    </div>\n  \n\n  <script>\n    // ========================\n    // 剧集点击处理\n    // ========================\n    const episodeContainer = document.getElementById('episodeContainer');\n    const messageEl = document.getElementById('message');\n    const posterContent = document.querySelector('.poster-content');\n    let inputPanel = null; // 存储弹幕面板的引用\n\n    // 为所有剧集卡片添加点击和键盘事件\n    document.querySelectorAll('.episode-card').forEach(card => {\n      card.addEventListener('click', handleEpisodeClick);\n      card.addEventListener('keydown', e => {\n        if (e.key === 'Enter') handleEpisodeClick.call(card, e);\n      });\n    });\n\n    function handleEpisodeClick(e) {\n      const card = this;\n      const url = card.dataset.url;\n\n      document.querySelectorAll('.episode-card').forEach(c => {\n        c.classList.remove('active', 'error');\n      });\n      card.classList.add('active');\n\n      showMessage('正在推送剧集...', 'success');\n\n      const formData = new FormData();\n      formData.append('_background', '1');\n      navigator.sendBeacon(url, formData);\n\n      setTimeout(() => {\n        showMessage('✅ 弹幕已推送', 'success');\n      }, 800);\n\n      setTimeout(hideMessage, 3000);\n    }\n\n    // ========================\n    // 弹幕功能 - 动态创建/移除面板\n    // ========================\n    const toggleBtn = document.getElementById('toggleInputBtn');\n    let isPanelVisible = false; // 跟踪面板状态\n    \n    toggleBtn.addEventListener('click', toggleDanmuPanel);\n    \n    function toggleDanmuPanel() {\n      if (isPanelVisible) {\n        // 隐藏面板并从DOM中移除\n        if (inputPanel) {\n          posterContent.removeChild(inputPanel);\n          inputPanel = null;\n        }\n        toggleBtn.innerHTML = '<i class=\"fas fa-comment-dots\"></i> 发弹幕';\n      } else {\n        // 创建并显示面板\n        createDanmuPanel();\n        toggleBtn.innerHTML = '<i class=\"fas fa-eye-slash\"></i> 隐藏';\n      }\n      isPanelVisible = !isPanelVisible;\n    }\n    \n    function createDanmuPanel() {\n      // 创建面板容器\n      inputPanel = document.createElement('div');\n      inputPanel.className = 'input-panel';\n      inputPanel.id = 'inputPanel';\n      \n      // 设置面板内容\n      inputPanel.innerHTML = `\n        <h3>发送你的弹幕</h3>\n        <textarea id=\"messageInput\" placeholder=\"输入弹幕内容（支持 Enter 发送）...\" rows=\"2\" tabindex=\"0\"></textarea>\n        <div class=\"input-row\">\n          <label for=\"usernameInput\">昵称：</label>\n          <input type=\"text\" id=\"usernameInput\" placeholder=\"请输入昵称\" value=\"";
        }
        return null;
    }

    /* renamed from: ۣۥۣ۠, reason: not valid java name and contains not printable characters */
    public static PorterDuff.Mode m6139() {
        if (C0062.m9429() >= 0) {
            return PorterDuff.Mode.SRC_IN;
        }
        return null;
    }

    /* renamed from: ۣۨۨۦ, reason: not valid java name and contains not printable characters */
    public static int m6140() {
        return (-352) ^ C0032.f630;
    }

    /* renamed from: ۤۢۡۥ, reason: not valid java name and contains not printable characters */
    public static C0268c m6141(Object obj) {
        if (C0010.m2320() <= 0) {
            return ((C0266a) obj).b;
        }
        return null;
    }

    /* renamed from: ۣۤ۟, reason: not valid java name and contains not printable characters */
    public static String m6142(Object obj) {
        if (C0059.m9257() <= 0) {
            return ((e) obj).d();
        }
        return null;
    }

    /* renamed from: ۤۤۧۨ, reason: not valid java name and contains not printable characters */
    public static int m6143(Object obj) {
        if (C0016.m3596() <= 0) {
            return ((r) obj).b;
        }
        return 0;
    }

    /* renamed from: ۤۥۢۤ, reason: not valid java name and contains not printable characters */
    public static void m6144(Object obj, Object obj2) {
        if (C0009.m2047() > 0) {
            ((C0246g) obj).v((String) obj2);
        }
    }

    /* renamed from: ۤۦ۠۠, reason: not valid java name and contains not printable characters */
    public static String m6145(Object obj) {
        if (C0029.m5282() >= 0) {
            return ((HBgetapp) obj).a;
        }
        return null;
    }

    /* renamed from: ۤۧۨ۟, reason: not valid java name and contains not printable characters */
    public static Class[] m6146(Object obj) {
        if (C0020.m4210() < 0) {
            return ((com.github.catvod.spider.merge.g1.f) obj).getClassContext();
        }
        return null;
    }

    /* renamed from: ۥ۟ۥ, reason: contains not printable characters */
    public static boolean m6147(Object obj, Object obj2) {
        if (C0060.m9355() >= 0) {
            return ((C0280j) obj).contains(obj2);
        }
        return false;
    }

    /* renamed from: ۥ۟ۥۡ, reason: contains not printable characters */
    public static int[] m6148(Object obj) {
        if (C0036.m6252() >= 0) {
            return ((P) obj).r;
        }
        return null;
    }

    /* renamed from: ۥ۠ۨ۠, reason: contains not printable characters */
    public static StringBuilder m6149(Object obj, int i) {
        if (C0049.m8038() < 0) {
            return ((StringBuilder) obj).appendCodePoint(i);
        }
        return null;
    }

    /* renamed from: ۥۡ۟ۥ, reason: contains not printable characters */
    public static Object m6150(Object obj) {
        if (C0062.m9429() > 0) {
            return ((DialogInterfaceOnClickListenerC0226b) obj).b;
        }
        return null;
    }

    /* renamed from: ۥۡۦ, reason: contains not printable characters */
    public static String m6151(Object obj) {
        if (C0012.m3024() > 0) {
            return Star.a((List) obj);
        }
        return null;
    }

    /* renamed from: ۥۡۦۥ, reason: contains not printable characters */
    public static String m6152(Object obj, Object obj2) {
        if (C0016.m3596() <= 0) {
            return ((c) obj).detailContent((List) obj2);
        }
        return null;
    }

    /* renamed from: ۥۣۦۧ, reason: contains not printable characters */
    public static String m6153(Object obj) {
        if (C0006.m1726() <= 0) {
            return ((com.github.catvod.spider.merge.U0.M) obj).m();
        }
        return null;
    }

    /* renamed from: ۥۥۢۡ, reason: contains not printable characters */
    public static String m6154(Object obj, Object obj2) {
        if (C0000.m1116() < 0) {
            return HBhcShun.encrypt((String) obj, (PublicKey) obj2);
        }
        return null;
    }

    /* renamed from: ۥۥۦ۟, reason: contains not printable characters */
    public static WebBackForwardList m6155() {
        if (C0005.m1599() <= 0) {
            return s.d;
        }
        return null;
    }

    /* renamed from: ۥۦۡۡ, reason: contains not printable characters */
    public static void m6156(Object obj) {
        if (C0028.m5152() < 0) {
            ((j) obj).i();
        }
    }

    /* renamed from: ۥۧۡۦ, reason: contains not printable characters */
    public static String m6157(Object obj) {
        if (C0063.m9589() <= 0) {
            return ((P) obj).f;
        }
        return null;
    }

    /* renamed from: ۥۨۢ, reason: contains not printable characters */
    public static Object[] m6158(Object obj) {
        if (C0059.m9257() <= 0) {
            return ((C0273c) obj).b;
        }
        return null;
    }

    /* renamed from: ۦۢۥۣ, reason: contains not printable characters */
    public static byte[] m6159(Object obj, Object obj2) {
        if (C0029.m5282() >= 0) {
            return ((MessageDigest) obj).digest((byte[]) obj2);
        }
        return null;
    }

    /* renamed from: ۧ۟ۢ, reason: not valid java name and contains not printable characters */
    public static InputStream m6160(Object obj) {
        if (C0049.m8038() < 0) {
            return ((com.github.catvod.spider.merge.l0.j) obj).c;
        }
        return null;
    }

    /* renamed from: ۧۡۤۧ, reason: not valid java name and contains not printable characters */
    public static String[] m6161() {
        if (C0055.m8740() >= 0) {
            return C0176b.A;
        }
        return null;
    }

    /* renamed from: ۣۧۥۧ, reason: not valid java name and contains not printable characters */
    public static int m6162(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ۧۧۥۥ, reason: not valid java name and contains not printable characters */
    public static boolean m6163(Object obj) {
        if (C0061.m9359() < 0) {
            return ((W) obj).b;
        }
        return false;
    }

    /* renamed from: ۧۨ۟ۦ, reason: not valid java name and contains not printable characters */
    public static boolean m6164(Object obj) {
        if (C0054.m8557() <= 0) {
            return ((com.github.catvod.spider.merge.U0.E) obj).d;
        }
        return false;
    }

    /* renamed from: ۧۨۥ, reason: not valid java name and contains not printable characters */
    public static int m6165(Object obj) {
        if (C0013.m3167() > 0) {
            return ((RunnableC0316E) obj).a;
        }
        return 0;
    }

    /* renamed from: ۣۨۧۦ, reason: not valid java name and contains not printable characters */
    public static void m6166(Object obj) {
        if (C0009.m2047() >= 0) {
            C0021.m4378((Button) obj, 0.0f);
        }
    }

    /* renamed from: ۨۥۤۥ, reason: not valid java name and contains not printable characters */
    public static String m6167(Object obj) {
        if (C0016.m3596() < 0) {
            return ((com.github.catvod.spider.merge.E.m) obj).c();
        }
        return null;
    }

    /* renamed from: ۨۦۨۢ, reason: not valid java name and contains not printable characters */
    public static C0335o m6168() {
        if (C0045.m7538() <= 0) {
            return AbstractC0334n.a;
        }
        return null;
    }

    /* renamed from: ۡۨۡۤ, reason: not valid java name and contains not printable characters */
    public static String m6131(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}