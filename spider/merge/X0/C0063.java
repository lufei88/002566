package com.github.catvod.spider.merge.x0;

import android.app.Notification;
import android.content.pm.ShortcutInfo;
import android.graphics.drawable.Drawable;
import android.os.LocaleList;
import android.os.Looper;
import android.os.Parcel;
import android.os.PersistableBundle;
import android.view.View;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Animation;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RemoteViews;
import androidx.core.util.Predicate;
import com.github.catvod.spider.AppYsV2;
import com.github.catvod.spider.ApplvDV2;
import com.github.catvod.spider.HBDmSou;
import com.github.catvod.spider.HBsuipian;
import com.github.catvod.spider.Libvio;
import com.github.catvod.spider.MYzhiqiu;
import com.github.catvod.spider.NG;
import com.github.catvod.spider.PTT;
import com.github.catvod.spider.Symx;
import com.github.catvod.spider.Wogg;
import com.github.catvod.spider.XBPQ;
import com.github.catvod.spider.XBPQa;
import com.github.catvod.spider.XBPQb;
import com.github.catvod.spider.merge.B.h;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E0.p;
import com.github.catvod.spider.merge.F.e;
import com.github.catvod.spider.merge.F0.AbstractC0152i;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.F0.C0144a;
import com.github.catvod.spider.merge.F0.d0;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.P0.A;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.T0.g;
import com.github.catvod.spider.merge.T0.t;
import com.github.catvod.spider.merge.U.i;
import com.github.catvod.spider.merge.U.n;
import com.github.catvod.spider.merge.U0.C0174a;
import com.github.catvod.spider.merge.U0.E;
import com.github.catvod.spider.merge.U0.O;
import com.github.catvod.spider.merge.U0.P;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V0.l;
import com.github.catvod.spider.merge.W.B;
import com.github.catvod.spider.merge.W.C;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.W.f;
import com.github.catvod.spider.merge.W.q;
import com.github.catvod.spider.merge.X0.w;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.AbstractC0238G;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a0.C0246g;
import com.github.catvod.spider.merge.a0.C0254o;
import com.github.catvod.spider.merge.a0.C0259u;
import com.github.catvod.spider.merge.a0.RunnableC0255p;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.a1.k;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0267b;
import com.github.catvod.spider.merge.d.C0268c;
import com.github.catvod.spider.merge.d.C0269d;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.e.C0281k;
import com.github.catvod.spider.merge.f.AbstractC0296g;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f.C0295f;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f0.C0304g;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.h0.C0315D;
import com.github.catvod.spider.merge.h0.r;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.p0.C0358a;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.Q.l0;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.net.InetAddress;
import java.net.URL;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.LockSupport;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.github.catvod.spider.merge.x0.۟ۦۥۢۧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0063 {

    /* renamed from: ۣ۠ۧ, reason: not valid java name and contains not printable characters */
    public static int f872 = 616;

    /* renamed from: ۟۟۟ۡ۠, reason: not valid java name and contains not printable characters */
    public static int m9490(Object obj) {
        if (C0048.m7971() > 0) {
            return ((com.github.catvod.spider.merge.C.b) obj).j;
        }
        return 0;
    }

    /* renamed from: ۟۟۠ۧۡ, reason: not valid java name and contains not printable characters */
    public static k m9491() {
        if (C0028.m5152() <= 0) {
            return AbstractC0296g.f;
        }
        return null;
    }

    /* renamed from: ۟۟ۡۢ, reason: not valid java name and contains not printable characters */
    public static int m9492(Object obj) {
        if (C0052.m8320() >= 0) {
            return ((C0174a) obj).d;
        }
        return 0;
    }

    /* renamed from: ۟۟ۡۦۤ, reason: not valid java name and contains not printable characters */
    public static char[] m9493() {
        if (C0000.m1116() <= 0) {
            return P.t;
        }
        return null;
    }

    /* renamed from: ۟۟ۡۧ۟, reason: not valid java name and contains not printable characters */
    public static LinearLayout m9494(Object obj) {
        if (C0058.m9131() < 0) {
            return ((f) obj).a;
        }
        return null;
    }

    /* renamed from: ۣۣ۟۟ۦ, reason: not valid java name and contains not printable characters */
    public static void m9495(Object obj) {
        if (C0057.m9017() >= 0) {
            ((Parcel) obj).recycle();
        }
    }

    /* renamed from: ۣ۟۟ۦ۠, reason: not valid java name and contains not printable characters */
    public static String m9496() {
        if (C0028.m5152() < 0) {
            return "请求头--> ";
        }
        return null;
    }

    /* renamed from: ۟۟ۤۤ۟, reason: not valid java name and contains not printable characters */
    public static XBPQ m9497(Object obj) {
        if (C0039.m6529() < 0) {
            return ((XBPQb) obj).c;
        }
        return null;
    }

    /* renamed from: ۣ۟۟ۨۦ, reason: not valid java name and contains not printable characters */
    public static String m9498(Object obj) {
        if (C0057.m9017() > 0) {
            return ((NG.DtIt) obj).b;
        }
        return null;
    }

    /* renamed from: ۣ۟۠۟ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m9499(Object obj, Object obj2) {
        if (C0035.m6140() < 0) {
            return ((JSONObject) obj).has((String) obj2);
        }
        return false;
    }

    /* renamed from: ۟۠ۡ۠ۢ, reason: not valid java name and contains not printable characters */
    public static void m9500(Object obj, int i, Object obj2) {
        if (C0006.m1726() < 0) {
            ((ArrayList) obj).add(i, obj2);
        }
    }

    /* renamed from: ۣ۟۠ۥۨ, reason: not valid java name and contains not printable characters */
    public static String m9501() {
        if (C0027.m5017() > 0) {
            return "\npostBody--> ";
        }
        return null;
    }

    /* renamed from: ۟۠ۥ۟, reason: not valid java name and contains not printable characters */
    public static String m9502() {
        if (C0002.m1242() > 0) {
            return "解密网址token错误！-->";
        }
        return null;
    }

    /* renamed from: ۟۠ۦ۟ۦ, reason: not valid java name and contains not printable characters */
    public static ArrayList m9503(Object obj, Object obj2, Object obj3) {
        if (C0050.m8121() < 0) {
            return ((i) obj).b((String) obj2, (ArrayList) obj3);
        }
        return null;
    }

    /* renamed from: ۟۠ۦۤۧ, reason: not valid java name and contains not printable characters */
    public static boolean m9504(Object obj, Object obj2) {
        if (C0038.m6471() >= 0) {
            return ((O) obj).h((String) obj2);
        }
        return false;
    }

    /* renamed from: ۟۠ۧ۟ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m9505(Object obj, Object obj2) {
        if (m9589() < 0) {
            return ((Predicate) obj).test(obj2);
        }
        return false;
    }

    /* renamed from: ۟۠ۧۧ۟, reason: not valid java name and contains not printable characters */
    public static String m9506(Object obj) {
        if (C0038.m6471() > 0) {
            return ((C0254o) obj).k;
        }
        return null;
    }

    /* renamed from: ۟۠ۧۧۦ, reason: not valid java name and contains not printable characters */
    public static int m9507(Object obj, Object obj2) {
        if (C0009.m2047() > 0) {
            return ((StringBuilder) obj).indexOf((String) obj2);
        }
        return 0;
    }

    /* renamed from: ۟ۡۡۥۦ, reason: not valid java name and contains not printable characters */
    public static String m9508() {
        if (C0029.m5282() >= 0) {
            return "五次";
        }
        return null;
    }

    /* renamed from: ۟ۡۤۥۣ, reason: not valid java name and contains not printable characters */
    public static boolean m9509(Object obj) {
        if (C0051.m8216() < 0) {
            return C0246g.n((String) obj);
        }
        return false;
    }

    /* renamed from: ۟ۡۧ۟ۧ, reason: not valid java name and contains not printable characters */
    public static void m9510(Object obj, Object obj2) {
        if (C0017.m3633() < 0) {
            com.github.catvod.spider.p000mergexbpq.N.a.j((String) obj, (String) obj2);
        }
    }

    /* renamed from: ۟ۡۧۤ, reason: not valid java name and contains not printable characters */
    public static boolean m9511(Object obj) {
        if (C0064.m9659() < 0) {
            return ((ShortcutInfo) obj).isDeclaredInManifest();
        }
        return false;
    }

    /* renamed from: ۟ۢ۟ۦۡ, reason: not valid java name and contains not printable characters */
    public static int m9512(float f) {
        if (C0019.m4065() <= 0) {
            return Math.round(f);
        }
        return 0;
    }

    /* renamed from: ۣ۟ۢۡۥ, reason: not valid java name and contains not printable characters */
    public static void m9513(Object obj, int i) {
        if (C0019.m4065() <= 0) {
            ((AccessibilityNodeInfo) obj).setMaxTextLength(i);
        }
    }

    /* renamed from: ۟ۢۢ۟ۦ, reason: not valid java name and contains not printable characters */
    public static IntBuffer m9514(int i) {
        if (C0015.m3433() >= 0) {
            return IntBuffer.allocate(i);
        }
        return null;
    }

    /* renamed from: ۟ۢۦ۟۟, reason: not valid java name and contains not printable characters */
    public static Object m9515(Object obj) {
        if (C0003.m1463() <= 0) {
            return ((r) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۢۧ۠۠, reason: not valid java name and contains not printable characters */
    public static String m9516(Object obj) {
        if (C0045.m7538() <= 0) {
            return ((PTT) obj).b;
        }
        return null;
    }

    /* renamed from: ۣ۟۠۟ۡ, reason: not valid java name and contains not printable characters */
    public static AccessibilityNodeInfo.CollectionItemInfo m9517(int i, int i2, int i3, int i4, boolean z) {
        if (C0014.m3353() < 0) {
            return AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z);
        }
        return null;
    }

    /* renamed from: ۣ۟ۢۡۤ, reason: not valid java name and contains not printable characters */
    public static String m9518(Object obj) {
        if (C0056.m8886() < 0) {
            return com.github.catvod.spider.merge.B0.a.A((ArrayList) obj);
        }
        return null;
    }

    /* renamed from: ۣ۟ۤۦۨ, reason: not valid java name and contains not printable characters */
    public static d0 m9519(Object obj, Object obj2) {
        if (C0057.m9017() >= 0) {
            return d0.b((d0) obj, (d0) obj2);
        }
        return null;
    }

    /* renamed from: ۣ۟ۥۦۡ, reason: not valid java name and contains not printable characters */
    public static List m9520(Object obj) {
        if (C0043.m7332() >= 0) {
            return ((com.github.catvod.spider.p000mergexbpq.c0.c) obj).f();
        }
        return null;
    }

    /* renamed from: ۣ۟ۦۡۨ, reason: not valid java name and contains not printable characters */
    public static String m9521() {
        if (C0002.m1242() > 0) {
            return "!";
        }
        return null;
    }

    /* renamed from: ۣ۟ۧۡ, reason: not valid java name and contains not printable characters */
    public static String m9522(Object obj) {
        if (C0019.m4065() < 0) {
            return ((C0304g) obj).a;
        }
        return null;
    }

    /* renamed from: ۣ۟ۤۢ۟, reason: not valid java name and contains not printable characters */
    public static HashMap m9523(Object obj, Object obj2) {
        if (C0031.m5628() > 0) {
            return ((Symx) obj).b((String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۤۦۡ۟, reason: not valid java name and contains not printable characters */
    public static String m9524() {
        if (C0001.m1164() <= 0) {
            return "dtNode";
        }
        return null;
    }

    /* renamed from: ۟ۥۣۡۡ, reason: not valid java name and contains not printable characters */
    public static PersistableBundle m9525(Object obj) {
        if (C0062.m9429() >= 0) {
            return ((ShortcutInfo) obj).getExtras();
        }
        return null;
    }

    /* renamed from: ۟ۥۣۢ, reason: not valid java name and contains not printable characters */
    public static String m9526(Object obj) {
        if (C0031.m5628() > 0) {
            return ((URL) obj).toExternalForm();
        }
        return null;
    }

    /* renamed from: ۟ۥۣۦۧ, reason: not valid java name and contains not printable characters */
    public static String m9527(Object obj, Object obj2, boolean z) {
        if (C0006.m1726() < 0) {
            return ((HBDmSou) obj).searchContent((String) obj2, z);
        }
        return null;
    }

    /* renamed from: ۟ۥۤ, reason: not valid java name and contains not printable characters */
    public static boolean m9528(int i) {
        if (C0021.m4379() > 0) {
            return Character.isDigit(i);
        }
        return false;
    }

    /* renamed from: ۟ۥۣۤۧ, reason: not valid java name and contains not printable characters */
    public static String m9529() {
        if (C0011.m2755() > 0) {
            return "<<eval";
        }
        return null;
    }

    /* renamed from: ۟ۥۥۡۨ, reason: not valid java name and contains not printable characters */
    public static WindowInsets m9530(Object obj) {
        if (C0038.m6471() > 0) {
            return ((WindowInsets) obj).consumeDisplayCutout();
        }
        return null;
    }

    /* renamed from: ۟ۥۧۢۤ, reason: not valid java name and contains not printable characters */
    public static int m9531(Object obj) {
        if (C0028.m5152() <= 0) {
            return ((l) obj).c;
        }
        return 0;
    }

    /* renamed from: ۟ۥۨۦ, reason: not valid java name and contains not printable characters */
    public static void m9532(Object obj, long j) {
        if (C0041.m6823() <= 0) {
            LockSupport.parkNanos(obj, j);
        }
    }

    /* renamed from: ۟ۦ۠ۧ۟, reason: not valid java name and contains not printable characters */
    public static String m9533(Object obj) {
        if (C0019.m4065() < 0) {
            return ((e) obj).a();
        }
        return null;
    }

    /* renamed from: ۟ۦۡ۠ۦ, reason: not valid java name and contains not printable characters */
    public static HashMap m9534() {
        if (C0042.m7147() <= 0) {
            return Libvio.a();
        }
        return null;
    }

    /* renamed from: ۟ۦۡۤ, reason: not valid java name and contains not printable characters */
    public static String m9535() {
        if (C0018.m3956() >= 0) {
            return "clan";
        }
        return null;
    }

    /* renamed from: ۟ۦۢۡۤ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.E0.c m9536(Object obj) {
        if (C0046.m7701() >= 0) {
            return B.b((String) obj);
        }
        return null;
    }

    /* renamed from: ۟ۦۢۤ۟, reason: not valid java name and contains not printable characters */
    public static boolean m9537(Object obj) {
        if (C0038.m6471() > 0) {
            return ((E) obj).i;
        }
        return false;
    }

    /* renamed from: ۟ۦۧۦۨ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.e1.b m9538(Object obj) {
        if (C0052.m8320() >= 0) {
            return com.github.catvod.spider.merge.e1.d.b((Class) obj);
        }
        return null;
    }

    /* renamed from: ۟ۨ۟۟, reason: not valid java name and contains not printable characters */
    public static HashMap m9539() {
        if (C0022.m4497() >= 0) {
            return Wogg.a();
        }
        return null;
    }

    /* renamed from: ۠۟۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m9540() {
        if (C0016.m3596() < 0) {
            return "；；";
        }
        return null;
    }

    /* renamed from: ۠۠ۥۤ, reason: not valid java name and contains not printable characters */
    public static void m9541(Object obj, int i, Object obj2) {
        if (C0001.m1164() <= 0) {
            com.github.catvod.spider.merge.T0.r.m((Appendable) obj, i, (g) obj2);
        }
    }

    /* renamed from: ۣ۠ۡ۠, reason: not valid java name and contains not printable characters */
    public static Map m9542(Object obj) {
        if (C0012.m3024() >= 0) {
            return ((RunnableC0255p) obj).c;
        }
        return null;
    }

    /* renamed from: ۠ۢ۠ۤ, reason: not valid java name and contains not printable characters */
    public static Object m9543(Object obj) {
        if (C0062.m9429() > 0) {
            return ((C0358a) obj).a;
        }
        return null;
    }

    /* renamed from: ۣ۠ۤ۠, reason: not valid java name and contains not printable characters */
    public static boolean m9544(Object obj) {
        if (C0030.m5375() > 0) {
            return ((C0269d) obj).b;
        }
        return false;
    }

    /* renamed from: ۠ۥۡۡ, reason: not valid java name and contains not printable characters */
    public static String m9545(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (C0009.m2047() > 0) {
            return com.github.catvod.spider.merge.B0.a.B((JSONObject) obj, (String) obj2, (JSONObject) obj3, (String) obj4, (String) obj5);
        }
        return null;
    }

    /* renamed from: ۠ۧۥۤ, reason: not valid java name and contains not printable characters */
    public static String m9546() {
        if (C0021.m4379() > 0) {
            return "http://";
        }
        return null;
    }

    /* renamed from: ۠ۨۦ۟, reason: not valid java name and contains not printable characters */
    public static String m9547(Object obj) {
        if (C0000.m1116() <= 0) {
            return ((com.github.catvod.spider.merge.h0.O) obj).b;
        }
        return null;
    }

    /* renamed from: ۡ۟ۦۧ, reason: not valid java name and contains not printable characters */
    public static Object m9548(Object obj, Object obj2) {
        if (C0003.m1463() < 0) {
            return ((Class) obj).cast(obj2);
        }
        return null;
    }

    /* renamed from: ۣۡ۠ۡ, reason: not valid java name and contains not printable characters */
    public static void m9549(Object obj, Object obj2) {
        if (C0002.m1242() > 0) {
            ((View) obj).startAnimation((Animation) obj2);
        }
    }

    /* renamed from: ۡۦ۟۠, reason: not valid java name and contains not printable characters */
    public static boolean m9550(Object obj, Object obj2) {
        if (C0019.m4065() < 0) {
            return ((List) obj).add(obj2);
        }
        return false;
    }

    /* renamed from: ۡۧۡۦ, reason: not valid java name and contains not printable characters */
    public static String m9551(Object obj) {
        if (C0061.m9359() < 0) {
            return ((LocaleList) obj).toString();
        }
        return null;
    }

    /* renamed from: ۡۨۥۣ, reason: not valid java name and contains not printable characters */
    public static void m9552(Object obj, Object obj2) {
        if (C0029.m5282() > 0) {
            ((O) obj).d((String) obj2);
        }
    }

    /* renamed from: ۣۢ۟ۤ, reason: not valid java name and contains not printable characters */
    public static Looper m9553() {
        if (C0052.m8320() >= 0) {
            return Looper.getMainLooper();
        }
        return null;
    }

    /* renamed from: ۢ۟ۦۤ, reason: not valid java name and contains not printable characters */
    public static int m9554(Object obj) {
        if (C0036.m6252() > 0) {
            return ((AccessibilityNodeInfo.CollectionInfo) obj).getSelectionMode();
        }
        return 0;
    }

    /* renamed from: ۢۢۥۣ, reason: not valid java name and contains not printable characters */
    public static boolean m9555(Object obj) {
        if (C0007.m1886() >= 0) {
            return ((InetAddress) obj).isLoopbackAddress();
        }
        return false;
    }

    /* renamed from: ۢۦۣۣ, reason: not valid java name and contains not printable characters */
    public static t m9556(Object obj) {
        if (C0031.m5628() > 0) {
            return ((t) obj).A();
        }
        return null;
    }

    /* renamed from: ۢۦۣۧ, reason: not valid java name and contains not printable characters */
    public static void m9557(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0027.m5017() > 0) {
            MYzhiqiu.a((JSONArray) obj, (String) obj2, (String) obj3, (String) obj4);
        }
    }

    /* renamed from: ۢۦۦۡ, reason: not valid java name and contains not printable characters */
    public static WeakReference m9558(Object obj) {
        if (C0045.m7538() <= 0) {
            return ((C) obj).a;
        }
        return null;
    }

    /* renamed from: ۢۧ۠ۥ, reason: not valid java name and contains not printable characters */
    public static void m9559(Object obj, int i) {
        if (C0054.m8557() < 0) {
            ((C0281k) obj).a(i);
        }
    }

    /* renamed from: ۢۨۥ, reason: not valid java name and contains not printable characters */
    public static h m9560(Object obj) {
        if (C0026.m4977() < 0) {
            return ((com.github.catvod.spider.merge.B.g) obj).a();
        }
        return null;
    }

    /* renamed from: ۣ۠ۢۡ, reason: not valid java name and contains not printable characters */
    public static int m9561(Object obj) {
        if (C0058.m9131() < 0) {
            return ((A) obj).a;
        }
        return 0;
    }

    /* renamed from: ۣۡۦۨ, reason: not valid java name and contains not printable characters */
    public static boolean m9562(Object obj, Object obj2) {
        if (C0001.m1164() < 0) {
            return ((List) obj).equals(obj2);
        }
        return false;
    }

    /* renamed from: ۣۣۢ۠, reason: not valid java name and contains not printable characters */
    public static Object m9563(Object obj) {
        if (C0060.m9355() >= 0) {
            return ((n) obj).c;
        }
        return null;
    }

    /* renamed from: ۣۣۤ۠, reason: not valid java name and contains not printable characters */
    public static C0268c m9564(Object obj, Object obj2) {
        if (C0015.m3433() > 0) {
            return ((C0267b) obj).b((C0268c) obj2);
        }
        return null;
    }

    /* renamed from: ۣۦۧۤ, reason: not valid java name and contains not printable characters */
    public static C0268c m9565(Object obj) {
        if (C0040.m6582() >= 0) {
            return ((C0268c) obj).d;
        }
        return null;
    }

    /* renamed from: ۣۧۡ۟, reason: not valid java name and contains not printable characters */
    public static int m9566(Object obj) {
        if (C0019.m4065() < 0) {
            return ((com.github.catvod.spider.merge.H0.d) obj).b;
        }
        return 0;
    }

    /* renamed from: ۣۤ۠ۡ, reason: not valid java name and contains not printable characters */
    public static String m9567(String str) {
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

    /* renamed from: ۤۡۧۤ, reason: not valid java name and contains not printable characters */
    public static String m9568(Object obj) {
        if (C0005.m1599() < 0) {
            return ((com.github.catvod.spider.merge.I.e) obj).a();
        }
        return null;
    }

    /* renamed from: ۤۢۥۢ, reason: not valid java name and contains not printable characters */
    public static String m9569(Object obj) {
        if (C0037.m6350() <= 0) {
            return com.github.catvod.spider.merge.D.f.g((String) obj);
        }
        return null;
    }

    /* renamed from: ۣۤۦۧ, reason: not valid java name and contains not printable characters */
    public static RemoteViews m9570(Object obj) {
        if (C0024.m4693() < 0) {
            return ((Notification) obj).headsUpContentView;
        }
        return null;
    }

    /* renamed from: ۤۥ۠ۧ, reason: not valid java name and contains not printable characters */
    public static C0295f m9571(Object obj) {
        if (C0004.m1557() < 0) {
            return ((C0295f) obj).b;
        }
        return null;
    }

    /* renamed from: ۤۥۧ۠, reason: not valid java name and contains not printable characters */
    public static String m9572(Object obj) {
        if (C0028.m5152() < 0) {
            return com.github.catvod.spider.merge.Z0.h.a((String) obj);
        }
        return null;
    }

    /* renamed from: ۤۨۤۢ, reason: not valid java name and contains not printable characters */
    public static JSONObject m9573(Object obj, Object obj2) {
        if (C0015.m3433() > 0) {
            return AppYsV2.jsonParse((String) obj, (String) obj2);
        }
        return null;
    }

    /* renamed from: ۤۨۧ۟, reason: not valid java name and contains not printable characters */
    public static String m9574(Object obj, Object obj2) {
        if (C0035.m6140() <= 0) {
            return ((com.github.catvod.spider.merge.T0.r) obj).a((String) obj2);
        }
        return null;
    }

    /* renamed from: ۥ۟۠ۧ, reason: contains not printable characters */
    public static int m9575(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ۥۥۦ۟, reason: contains not printable characters */
    public static com.github.catvod.spider.merge.H0.f m9576(Object obj, Object obj2, Object obj3) {
        if (C0052.m8320() >= 0) {
            return ((C0144a) obj).d((AbstractC0152i) obj2, (p) obj3);
        }
        return null;
    }

    /* renamed from: ۥۥۣۨ, reason: contains not printable characters */
    public static C0315D m9577() {
        if (C0000.m1116() < 0) {
            return C0315D.a();
        }
        return null;
    }

    /* renamed from: ۥۣۨۡ, reason: contains not printable characters */
    public static C0254o m9578() {
        if (C0041.m6823() <= 0) {
            return AbstractC0238G.a;
        }
        return null;
    }

    /* renamed from: ۥۣۨۥ, reason: contains not printable characters */
    public static String m9579() {
        if (C0018.m3956() >= 0) {
            return "动漫";
        }
        return null;
    }

    /* renamed from: ۦ۠ۡ۟, reason: contains not printable characters */
    public static boolean m9580(Object obj) {
        if (C0013.m3167() > 0) {
            return ((Drawable) obj).isVisible();
        }
        return false;
    }

    /* renamed from: ۦۣۢ۟, reason: contains not printable characters */
    public static int m9581(Object obj) {
        if (C0037.m6350() <= 0) {
            return com.github.catvod.spider.merge.E.l.j((String) obj);
        }
        return 0;
    }

    /* renamed from: ۦۥۣ۠, reason: contains not printable characters */
    public static Object m9582(Object obj, Object obj2) {
        if (C0008.m1975() > 0) {
            return ((w) obj).a((com.github.catvod.spider.merge.Y0.c) obj2);
        }
        return null;
    }

    /* renamed from: ۦۥۢۨ, reason: contains not printable characters */
    public static com.github.catvod.spider.merge.B.g m9583() {
        if (C0011.m2755() > 0) {
            return com.github.catvod.spider.merge.B.g.ON_RESUME;
        }
        return null;
    }

    /* renamed from: ۦۨۦ, reason: contains not printable characters */
    public static int m9584(Object obj) {
        if (C0026.m4977() < 0) {
            return ((com.github.catvod.spider.p000mergexbpq.c0.l) obj).U();
        }
        return 0;
    }

    /* renamed from: ۧ۟ۢۡ, reason: not valid java name and contains not printable characters */
    public static void m9586(Object obj) {
        if (C0012.m3024() >= 0) {
            ((C0259u) obj).l();
        }
    }

    /* renamed from: ۧ۠۠ۡ, reason: not valid java name and contains not printable characters */
    public static int[] m9587(Object obj) {
        if (C0011.m2755() >= 0) {
            return ((C0144a) obj).g;
        }
        return null;
    }

    /* renamed from: ۧۢ۟ۨ, reason: not valid java name and contains not printable characters */
    public static l0 m9588(Object obj) {
        if (C0046.m7701() > 0) {
            return ((com.github.catvod.spider.p000mergexbpq.R.d) obj).a;
        }
        return null;
    }

    /* renamed from: ۧۢۡۡ, reason: not valid java name and contains not printable characters */
    public static int m9589() {
        return 208 ^ C0028.f495;
    }

    /* renamed from: ۧۢۡۢ, reason: not valid java name and contains not printable characters */
    public static String m9590() {
        if (C0034.m6048() <= 0) {
            return "{tk}";
        }
        return null;
    }

    /* renamed from: ۣۧۤ, reason: not valid java name and contains not printable characters */
    public static Object[] m9591(Object obj) {
        if (C0016.m3596() < 0) {
            return com.github.catvod.spider.merge.w0.g.f((Collection) obj);
        }
        return null;
    }

    /* renamed from: ۧۤ۟ۤ, reason: not valid java name and contains not printable characters */
    public static String m9592(Object obj) {
        if (C0025.m4797() >= 0) {
            return ((ApplvDV2) obj).b();
        }
        return null;
    }

    /* renamed from: ۧۥۥۢ, reason: not valid java name and contains not printable characters */
    public static void m9593(Object obj) {
        if (C0040.m6582() >= 0) {
            ((HBsuipian) obj).login();
        }
    }

    /* renamed from: ۧۦۨۥ, reason: not valid java name and contains not printable characters */
    public static void m9594(Object obj, int i) {
        if (C0036.m6252() > 0) {
            ((AdapterView) obj).setSelection(i);
        }
    }

    /* renamed from: ۨۡۤۧ, reason: not valid java name and contains not printable characters */
    public static void m9595(Object obj, Object obj2, int i) {
        if (C0042.m7147() <= 0) {
            ((q) obj).f((ImageButton) obj2, i);
        }
    }

    /* renamed from: ۨۦ۟ۤ, reason: not valid java name and contains not printable characters */
    public static int m9596(Object obj) {
        if (C0027.m5017() >= 0) {
            return ((NG.Rst) obj).d;
        }
        return 0;
    }

    /* renamed from: ۣۣۨۧ, reason: not valid java name and contains not printable characters */
    public static XBPQ m9597(Object obj) {
        if (C0034.m6048() < 0) {
            return ((XBPQa) obj).c;
        }
        return null;
    }

    /* renamed from: ۦۨۧۧ, reason: contains not printable characters */
    public static String m9585(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}