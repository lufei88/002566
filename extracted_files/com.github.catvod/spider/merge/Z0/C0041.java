package com.github.catvod.spider.merge.Z0;

import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Insets;
import android.graphics.Point;
import android.graphics.Typeface;
import android.os.Handler;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import android.webkit.WebView;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import com.github.catvod.spider.ApplvDV2;
import com.github.catvod.spider.Cloud;
import com.github.catvod.spider.Config;
import com.github.catvod.spider.HBPQ;
import com.github.catvod.spider.HBPguo;
import com.github.catvod.spider.HBleiJing;
import com.github.catvod.spider.HBsuipian;
import com.github.catvod.spider.MYzhiqiu;
import com.github.catvod.spider.NG;
import com.github.catvod.spider.Proxy;
import com.github.catvod.spider.UC;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.F0.AbstractC0151h;
import com.github.catvod.spider.merge.F0.AbstractC0152i;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.F0.C0144a;
import com.github.catvod.spider.merge.F0.C0145b;
import com.github.catvod.spider.merge.F0.C0148e;
import com.github.catvod.spider.merge.F0.C0161s;
import com.github.catvod.spider.merge.F0.C0163u;
import com.github.catvod.spider.merge.F0.L;
import com.github.catvod.spider.merge.F0.Q;
import com.github.catvod.spider.merge.F0.l0;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.P0.s;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.r;
import com.github.catvod.spider.merge.U0.D;
import com.github.catvod.spider.merge.U0.E;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.W.q;
import com.github.catvod.spider.merge.W.w;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a0.C0253n;
import com.github.catvod.spider.merge.a0.W;
import com.github.catvod.spider.merge.a0.y;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d.C0266a;
import com.github.catvod.spider.merge.d.C0268c;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.e.AbstractC0274d;
import com.github.catvod.spider.merge.e.C0271a;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f.C0293d;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.g0.AbstractC0308c;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.h0.C0340u;
import com.github.catvod.spider.merge.h0.RunnableC0336p;
import com.github.catvod.spider.merge.h0.x;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.x0.C0413c;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.z.RunnableC0418a;
import com.github.catvod.spider.p000mergexbpq.P.B;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b.p;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.d0.P;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.net.URI;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.github.catvod.spider.merge.Z0.ۦۣ۠ۥ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0041 {

    /* renamed from: ۦۥۦۧ, reason: contains not printable characters */
    public static int f702 = 211;

    /* renamed from: ۟۟۟۟ۦ, reason: not valid java name and contains not printable characters */
    public static Class m6741() {
        if (C0019.m4065() < 0) {
            return HBPQ.d;
        }
        return null;
    }

    /* renamed from: ۟۟۟ۢۡ, reason: not valid java name and contains not printable characters */
    public static int m6742(Object obj) {
        if (C0029.m5282() > 0) {
            return ((RunnableC0418a) obj).a;
        }
        return 0;
    }

    /* renamed from: ۟۟۠۠ۧ, reason: not valid java name and contains not printable characters */
    public static C0161s m6743() {
        if (C0047.m7837() >= 0) {
            return Q.b;
        }
        return null;
    }

    /* renamed from: ۟۟۠ۢۦ, reason: not valid java name and contains not printable characters */
    public static int m6744(Object obj) {
        if (C0062.m9429() >= 0) {
            return ((Bitmap) obj).getWidth();
        }
        return 0;
    }

    /* renamed from: ۣ۟۟۠ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m6745(Object obj, Object obj2) {
        if (C0053.m8389() > 0) {
            return com.github.catvod.spider.p000mergexbpq.b0.b.b((String) obj, (String[]) obj2);
        }
        return false;
    }

    /* renamed from: ۟۠۟۟ۨ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.p000mergexbpq.c.g m6746(Object obj, Object obj2, Object obj3) {
        if (C0021.m4379() > 0) {
            return ((p) obj).z((String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۣ۟۠ۢۨ, reason: not valid java name and contains not printable characters */
    public static int m6747(Object obj) {
        if (C0007.m1886() > 0) {
            return ((DisplayCutout) obj).hashCode();
        }
        return 0;
    }

    /* renamed from: ۣ۟۠۟ۡ, reason: not valid java name and contains not printable characters */
    public static C0148e m6748(Object obj, Object obj2, Object obj3, boolean z) {
        if (C0035.m6140() <= 0) {
            return ((L) obj).i((AbstractC0152i) obj2, (com.github.catvod.spider.merge.E0.p) obj3, z);
        }
        return null;
    }

    /* renamed from: ۟۠ۥۣۨ, reason: not valid java name and contains not printable characters */
    public static int m6749(Object obj) {
        if (C0007.m1886() >= 0) {
            return ((TextView) obj).length();
        }
        return 0;
    }

    /* renamed from: ۟۠ۧۦۡ, reason: not valid java name and contains not printable characters */
    public static boolean m6750(Object obj) {
        if (C0037.m6350() < 0) {
            return ((P) obj).m();
        }
        return false;
    }

    /* renamed from: ۟۠ۨ۠۠, reason: not valid java name and contains not printable characters */
    public static boolean m6751(Object obj, int i) {
        if (C0054.m8557() <= 0) {
            return com.github.catvod.spider.merge.B0.a.a((com.github.catvod.spider.merge.e1.b) obj, i);
        }
        return false;
    }

    /* renamed from: ۟ۡ۟ۦ, reason: not valid java name and contains not printable characters */
    public static String m6752(Object obj) {
        if (C0044.m7508() < 0) {
            return com.github.catvod.spider.merge.g0.e.p((String) obj);
        }
        return null;
    }

    /* renamed from: ۟ۡ۠۟ۦ, reason: not valid java name and contains not printable characters */
    public static HashMap m6753(Object obj) {
        if (C0026.m4977() <= 0) {
            return ((com.github.catvod.spider.merge.d0.d) obj).b;
        }
        return null;
    }

    /* renamed from: ۣ۟ۡ۠ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m6754(Object obj) {
        if (C0028.m5152() <= 0) {
            return ((D) obj).b;
        }
        return false;
    }

    /* renamed from: ۟ۡۡۥ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.w0.k m6755() {
        if (C0029.m5282() >= 0) {
            return com.github.catvod.spider.merge.w0.j.a;
        }
        return null;
    }

    /* renamed from: ۟ۡۤۢۧ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.y0.e m6756(Object obj) {
        if (C0022.m4497() > 0) {
            return ((com.github.catvod.spider.merge.w0.e) obj).getReflected();
        }
        return null;
    }

    /* renamed from: ۟ۢ۟۟ۡ, reason: not valid java name and contains not printable characters */
    public static void m6757(long j, long j2, long j3) {
        if (C0040.m6582() > 0) {
            com.github.catvod.spider.merge.Z.c.j(j, j2, j3);
        }
    }

    /* renamed from: ۟ۢ۟ۥ۠, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.B.h m6758(Object obj, Object obj2) {
        if (C0044.m7508() < 0) {
            return ((com.github.catvod.spider.merge.B.l) obj).c((com.github.catvod.spider.merge.B.j) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۢ۠ۢۥ, reason: not valid java name and contains not printable characters */
    public static String m6759(String str) {
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

    /* renamed from: ۣ۟ۢ۠ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m6760(Object obj) {
        if (C0059.m9257() < 0) {
            return ((HashMap) obj).isEmpty();
        }
        return false;
    }

    /* renamed from: ۟ۢۥۧۨ, reason: not valid java name and contains not printable characters */
    public static String m6761(Object obj) {
        if (C0062.m9429() >= 0) {
            return ((q) obj).j;
        }
        return null;
    }

    /* renamed from: ۣۣ۟ۢۨ, reason: not valid java name and contains not printable characters */
    public static AlertDialog m6762(Object obj) {
        if (C0032.m5686() < 0) {
            return ((W) obj).c;
        }
        return null;
    }

    /* renamed from: ۟ۢۨۥۥ, reason: not valid java name and contains not printable characters */
    public static boolean m6763(Object obj, Object obj2) {
        if (C0050.m8121() <= 0) {
            return ((Map.Entry) obj).equals(obj2);
        }
        return false;
    }

    /* renamed from: ۣ۟۟۠ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m6764(Object obj) {
        if (C0013.m3167() >= 0) {
            return ((l0) obj).b();
        }
        return false;
    }

    /* renamed from: ۣ۟۠ۢۨ, reason: not valid java name and contains not printable characters */
    public static boolean m6765(Object obj) {
        if (C0004.m1557() < 0) {
            return ((C0148e) obj).a;
        }
        return false;
    }

    /* renamed from: ۣ۟ۡۢ۠, reason: not valid java name and contains not printable characters */
    public static WeakHashMap m6766(Object obj) {
        if (C0056.m8886() < 0) {
            return ((C0266a) obj).c;
        }
        return null;
    }

    /* renamed from: ۣۣ۟۟ۦ, reason: not valid java name and contains not printable characters */
    public static int m6767() {
        if (C0029.m5282() > 0) {
            return Proxy.a;
        }
        return 0;
    }

    /* renamed from: ۣۣ۟ۦۢ, reason: not valid java name and contains not printable characters */
    public static AtomicReferenceFieldUpdater m6768(Object obj) {
        if (C0049.m8038() <= 0) {
            return ((C0293d) obj).b;
        }
        return null;
    }

    /* renamed from: ۣۣ۟ۧ۠, reason: not valid java name and contains not printable characters */
    public static String[] m6769() {
        if (C0058.m9131() < 0) {
            return E.o;
        }
        return null;
    }

    /* renamed from: ۣۣ۟ۧۢ, reason: not valid java name and contains not printable characters */
    public static String m6770(Object obj) {
        if (C0017.m3633() <= 0) {
            return ((JSONArray) obj).toString();
        }
        return null;
    }

    /* renamed from: ۟ۤۢۦ۟, reason: not valid java name and contains not printable characters */
    public static int m6771(Object obj) {
        if (C0018.m3956() > 0) {
            return ((Number) obj).intValue();
        }
        return 0;
    }

    /* renamed from: ۟ۤۢۧۨ, reason: not valid java name and contains not printable characters */
    public static void m6772(Object obj, Object obj2, Object obj3) {
        if (C0058.m9131() < 0) {
            ApplvDV2.a((JSONObject) obj, (String) obj2, (ArrayList) obj3);
        }
    }

    /* renamed from: ۟ۤۥۡ, reason: not valid java name and contains not printable characters */
    public static int m6773(Object obj) {
        if (C0052.m8320() >= 0) {
            return ((B) obj).i();
        }
        return 0;
    }

    /* renamed from: ۟ۥ۟ۢۤ, reason: not valid java name and contains not printable characters */
    public static ViewGroup.LayoutParams m6774(Object obj) {
        if (C0025.m4797() >= 0) {
            return ((View) obj).getLayoutParams();
        }
        return null;
    }

    /* renamed from: ۟ۥ۟ۨۤ, reason: not valid java name and contains not printable characters */
    public static Object m6775(Object obj) {
        if (C0017.m3633() <= 0) {
            return ((com.github.catvod.spider.p000mergexbpq.b.k) obj).d;
        }
        return null;
    }

    /* renamed from: ۟ۥۣۥۨ, reason: not valid java name and contains not printable characters */
    public static String m6776(Object obj) {
        if (C0046.m7701() > 0) {
            return ((r) obj).o();
        }
        return null;
    }

    /* renamed from: ۟ۥۤۡۤ, reason: not valid java name and contains not printable characters */
    public static String m6777(Object obj, Object obj2, Object obj3) {
        if (C0064.m9659() <= 0) {
            return ((MYzhiqiu) obj).i((String) obj2, (JSONObject) obj3);
        }
        return null;
    }

    /* renamed from: ۟ۥۨ۠ۤ, reason: not valid java name and contains not printable characters */
    public static void m6778(Object obj) {
        if (C0015.m3433() > 0) {
            obj.notifyAll();
        }
    }

    /* renamed from: ۟ۦۣ۟, reason: not valid java name and contains not printable characters */
    public static String m6780(Object obj) {
        if (C0028.m5152() <= 0) {
            return System.getenv((String) obj);
        }
        return null;
    }

    /* renamed from: ۟ۦۣۤۢ, reason: not valid java name and contains not printable characters */
    public static UC m6781(Object obj) {
        if (C0010.m2320() < 0) {
            return ((Cloud) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۦۥۥۡ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.R.a m6782(Object obj) {
        if (C0035.m6140() < 0) {
            return com.github.catvod.spider.merge.R.a.b((String) obj);
        }
        return null;
    }

    /* renamed from: ۟ۦۣۨۤ, reason: not valid java name and contains not printable characters */
    public static void m6783(Object obj) {
        if (C0011.m2755() > 0) {
            Config.c((String) obj);
        }
    }

    /* renamed from: ۟ۧ۟ۨۦ, reason: not valid java name and contains not printable characters */
    public static int m6784(Object obj) {
        if (C0059.m9257() <= 0) {
            return ((C0413c) obj).a;
        }
        return 0;
    }

    /* renamed from: ۣ۟ۧۢۢ, reason: not valid java name and contains not printable characters */
    public static String m6785(Object obj) {
        if (C0055.m8740() >= 0) {
            return ((HBsuipian) obj).a;
        }
        return null;
    }

    /* renamed from: ۣ۟ۧۤ, reason: not valid java name and contains not printable characters */
    public static AccessibilityNodeInfo.AccessibilityAction m6786() {
        if (C0020.m4210() < 0) {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
        }
        return null;
    }

    /* renamed from: ۟ۧۥۧۡ, reason: not valid java name and contains not printable characters */
    public static C0268c m6787(Object obj) {
        if (C0021.m4379() >= 0) {
            return ((C0266a) obj).a;
        }
        return null;
    }

    /* renamed from: ۟ۧۧۧۨ, reason: not valid java name and contains not printable characters */
    public static String m6788() {
        if (C0061.m9359() <= 0) {
            return "playerContent跳转播放链接错误！-->";
        }
        return null;
    }

    /* renamed from: ۟ۨ۟ۤ, reason: not valid java name and contains not printable characters */
    public static void m6789(Object obj, boolean z) {
        if (C0061.m9359() < 0) {
            ((View) obj).setSelected(z);
        }
    }

    /* renamed from: ۠۟ۨ۟, reason: not valid java name and contains not printable characters */
    public static void m6790(Object obj, Object obj2, Object obj3) {
        if (C0060.m9355() >= 0) {
            ((ViewGroup) obj).addView((View) obj2, (ViewGroup.LayoutParams) obj3);
        }
    }

    /* renamed from: ۠ۡۨۡ, reason: not valid java name and contains not printable characters */
    public static int m6791(Object obj) {
        if (C0001.m1164() <= 0) {
            return ((com.github.catvod.spider.p000mergexbpq.c0.r) obj).h();
        }
        return 0;
    }

    /* renamed from: ۣ۠ۢۢ, reason: not valid java name and contains not printable characters */
    public static int m6792(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ۠ۦۨ۟, reason: not valid java name and contains not printable characters */
    public static Object m6793(Object obj, int i, int i2) {
        if (C0006.m1726() < 0) {
            return ((C0271a) obj).b(i, i2);
        }
        return null;
    }

    /* renamed from: ۠ۦۨۤ, reason: not valid java name and contains not printable characters */
    public static C0340u m6794(Object obj) {
        if (C0005.m1599() <= 0) {
            return ((RunnableC0336p) obj).b;
        }
        return null;
    }

    /* renamed from: ۠ۨ۠ۧ, reason: not valid java name and contains not printable characters */
    public static Intent m6795(Object obj, Object obj2, Object obj3) {
        if (C0063.m9589() < 0) {
            return ((Intent) obj).setClassName((String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۡ۠۠ۡ, reason: not valid java name and contains not printable characters */
    public static void m6796(Object obj, int i, int i2) {
        if (C0046.m7701() > 0) {
            ((HorizontalScrollView) obj).scrollTo(i, i2);
        }
    }

    /* renamed from: ۡ۠ۨۦ, reason: not valid java name and contains not printable characters */
    public static void m6797(Object obj, int i, int i2) {
        if (C0026.m4977() <= 0) {
            ((View) obj).measure(i, i2);
        }
    }

    /* renamed from: ۡۡۢۢ, reason: not valid java name and contains not printable characters */
    public static void m6798(Object obj) {
        if (C0015.m3433() >= 0) {
            ((WebView) obj).goBack();
        }
    }

    /* renamed from: ۡۡۦ, reason: not valid java name and contains not printable characters */
    public static void m6799(Object obj, Object obj2) {
        if (C0039.m6529() <= 0) {
            ((com.github.catvod.spider.p000mergexbpq.c.g) obj).l((String) obj2);
        }
    }

    /* renamed from: ۡۤۡۤ, reason: not valid java name and contains not printable characters */
    public static C0144a m6800(Object obj) {
        if (C0042.m7147() < 0) {
            return ((AbstractC0151h) obj).a;
        }
        return null;
    }

    /* renamed from: ۡۥ۟, reason: not valid java name and contains not printable characters */
    public static HashMap m6801(Object obj) {
        if (C0033.m5872() > 0) {
            return ((com.github.catvod.spider.merge.a0.L) obj).b;
        }
        return null;
    }

    /* renamed from: ۡۦۥۦ, reason: not valid java name and contains not printable characters */
    public static String m6802() {
        if (C0057.m9017() > 0) {
            return "ua";
        }
        return null;
    }

    /* renamed from: ۡۧۧۢ, reason: not valid java name and contains not printable characters */
    public static HashMap m6803(Object obj) {
        if (C0034.m6048() <= 0) {
            return ((com.github.catvod.spider.merge.G0.b) obj).a;
        }
        return null;
    }

    /* renamed from: ۢۢۢۦ, reason: not valid java name and contains not printable characters */
    public static void m6804(Object obj, Object obj2, int i) {
        if (C0015.m3433() > 0) {
            ((TextView) obj).setTypeface((Typeface) obj2, i);
        }
    }

    /* renamed from: ۣۢۤ۠, reason: not valid java name and contains not printable characters */
    public static int[] m6805() {
        if (C0043.m7332() >= 0) {
            return AbstractC0274d.a;
        }
        return null;
    }

    /* renamed from: ۢۤۥ۠, reason: not valid java name and contains not printable characters */
    public static JSONObject m6806() {
        if (C0064.m9659() <= 0) {
            return p.l;
        }
        return null;
    }

    /* renamed from: ۢۤۨۦ, reason: not valid java name and contains not printable characters */
    public static int m6807(Object obj) {
        if (C0022.m4497() >= 0) {
            return ((WindowInsets) obj).getSystemWindowInsetBottom();
        }
        return 0;
    }

    /* renamed from: ۢۦۧۢ, reason: not valid java name and contains not printable characters */
    public static void m6808(Object obj, Object obj2) {
        if (C0059.m9257() <= 0) {
            ((TextView) obj).setTypeface((Typeface) obj2);
        }
    }

    /* renamed from: ۢۧ۠ۦ, reason: not valid java name and contains not printable characters */
    public static void m6809(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0005.m1599() < 0) {
            ((C0253n) obj).c((String) obj2, (String) obj3, (String) obj4);
        }
    }

    /* renamed from: ۢۧۡ, reason: not valid java name and contains not printable characters */
    public static WindowInsets.Builder m6810(Object obj, int i, Object obj2) {
        if (C0003.m1463() < 0) {
            return ((WindowInsets.Builder) obj).setInsets(i, (Insets) obj2);
        }
        return null;
    }

    /* renamed from: ۢۧۧ۟, reason: not valid java name and contains not printable characters */
    public static int m6811(Object obj) {
        if (C0014.m3353() <= 0) {
            return ((Point) obj).x;
        }
        return 0;
    }

    /* renamed from: ۣۢۥۥ, reason: not valid java name and contains not printable characters */
    public static String m6812() {
        if (C0001.m1164() <= 0) {
            return "热";
        }
        return null;
    }

    /* renamed from: ۣۢۧۥ, reason: not valid java name and contains not printable characters */
    public static double m6813(double d) {
        if (C0055.m8740() >= 0) {
            return Math.floor(d);
        }
        return 0.0d;
    }

    /* renamed from: ۣۧۥۨ, reason: not valid java name and contains not printable characters */
    public static String m6814(Object obj) {
        if (C0038.m6471() > 0) {
            return ((NG) obj).c;
        }
        return null;
    }

    /* renamed from: ۣۤ۠, reason: not valid java name and contains not printable characters */
    public static String m6815(Object obj) {
        if (C0051.m8216() <= 0) {
            return AbstractC0308c.j(obj);
        }
        return null;
    }

    /* renamed from: ۤۢ۠۟, reason: not valid java name and contains not printable characters */
    public static String m6816() {
        if (C0007.m1886() >= 0) {
            return "webViewDialog睡眠错误-->";
        }
        return null;
    }

    /* renamed from: ۤۨۦ۠, reason: not valid java name and contains not printable characters */
    public static String m6817() {
        if (C0050.m8121() <= 0) {
            return "弹窗验证，源码为--> ";
        }
        return null;
    }

    /* renamed from: ۥۣ۟ۤ, reason: contains not printable characters */
    public static int m6818(Object obj) {
        if (C0048.m7971() > 0) {
            return ((x) obj).f;
        }
        return 0;
    }

    /* renamed from: ۥ۠ۤ۟, reason: contains not printable characters */
    public static String m6819(int i) {
        if (C0057.m9017() >= 0) {
            return com.github.catvod.spider.p000mergexbpq.b0.b.f(i);
        }
        return null;
    }

    /* renamed from: ۥۣۢۨ, reason: contains not printable characters */
    public static boolean m6820(Object obj, Object obj2, long j) {
        if (C0033.m5872() > 0) {
            return ((Handler) obj).postDelayed((Runnable) obj2, j);
        }
        return false;
    }

    /* renamed from: ۥۤۧۦ, reason: contains not printable characters */
    public static String m6821(Object obj) {
        if (C0026.m4977() <= 0) {
            return com.github.catvod.spider.merge.W.p.c((String) obj);
        }
        return null;
    }

    /* renamed from: ۥۦۢ, reason: contains not printable characters */
    public static String m6822(Object obj) {
        if (C0021.m4379() >= 0) {
            return ((HBPguo) obj).a;
        }
        return null;
    }

    /* renamed from: ۥۦۣۦ, reason: contains not printable characters */
    public static int m6823() {
        return (-368) ^ C0050.f771;
    }

    /* renamed from: ۥۧۢۢ, reason: contains not printable characters */
    public static WeakReference m6824(Object obj) {
        if (C0059.m9257() < 0) {
            return ((w) obj).a;
        }
        return null;
    }

    /* renamed from: ۥۨۨۦ, reason: contains not printable characters */
    public static C0148e m6825(Object obj, Object obj2, int i, boolean z) {
        if (C0024.m4693() <= 0) {
            return ((L) obj).h((C0148e) obj2, i, z);
        }
        return null;
    }

    /* renamed from: ۦ۟ۤۦ, reason: contains not printable characters */
    public static AlertDialog m6826(Object obj) {
        if (C0062.m9429() > 0) {
            return ((HBleiJing) obj).i;
        }
        return null;
    }

    /* renamed from: ۦۡ۟ۤ, reason: contains not printable characters */
    public static void m6827(Object obj) {
        if (C0004.m1557() <= 0) {
            ((C0253n) obj).i();
        }
    }

    /* renamed from: ۦۥ۠۟, reason: contains not printable characters */
    public static Normalizer.Form m6828() {
        if (C0026.m4977() < 0) {
            return Normalizer.Form.NFD;
        }
        return null;
    }

    /* renamed from: ۦۥۦۦ, reason: contains not printable characters */
    public static int m6829(Object obj) {
        if (C0050.m8121() <= 0) {
            return ((AtomicInteger) obj).getAndIncrement();
        }
        return 0;
    }

    /* renamed from: ۦۥۣۨ, reason: contains not printable characters */
    public static int m6830(Object obj) {
        if (C0053.m8389() > 0) {
            return ((s) obj).a;
        }
        return 0;
    }

    /* renamed from: ۦۧۢ, reason: contains not printable characters */
    public static void m6831(Object obj) {
        if (C0043.m7332() > 0) {
            ((W) obj).g();
        }
    }

    /* renamed from: ۣۧ۟ۤ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.E0.s m6832(Object obj) {
        if (C0053.m8389() >= 0) {
            return ((com.github.catvod.spider.merge.E0.q) obj).a;
        }
        return null;
    }

    /* renamed from: ۧ۠ۤۧ, reason: not valid java name and contains not printable characters */
    public static String m6833() {
        if (C0038.m6471() >= 0) {
            return "qishiye";
        }
        return null;
    }

    /* renamed from: ۧۡۨۦ, reason: not valid java name and contains not printable characters */
    public static Object m6834(Object obj) {
        if (C0000.m1116() < 0) {
            return ((com.github.catvod.spider.merge.Y0.b) obj).a;
        }
        return null;
    }

    /* renamed from: ۧۡۨۧ, reason: not valid java name and contains not printable characters */
    public static void m6835(Object obj, Object obj2, Object obj3) {
        if (C0013.m3167() >= 0) {
            ((C0148e) obj).a((C0145b) obj2, (C0163u) obj3);
        }
    }

    /* renamed from: ۧۧ۠ۦ, reason: not valid java name and contains not printable characters */
    public static String m6836(Object obj) {
        if (C0049.m8038() < 0) {
            return ((URI) obj).getQuery();
        }
        return null;
    }

    /* renamed from: ۨ۟۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m6837() {
        if (C0063.m9589() < 0) {
            return "中国";
        }
        return null;
    }

    /* renamed from: ۣۨۨۨ, reason: not valid java name and contains not printable characters */
    public static boolean m6838(Object obj, Object obj2) {
        if (C0040.m6582() > 0) {
            return ((ArrayList) obj).contains(obj2);
        }
        return false;
    }

    /* renamed from: ۨۧۦ, reason: not valid java name and contains not printable characters */
    public static String m6839(Object obj) {
        if (C0012.m3024() >= 0) {
            return ((y) obj).c;
        }
        return null;
    }

    /* renamed from: ۟ۦ۠ۧۧ, reason: not valid java name and contains not printable characters */
    public static String m6779(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}