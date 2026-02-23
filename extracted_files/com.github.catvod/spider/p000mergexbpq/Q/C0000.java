package com.github.catvod.spider.p000mergexbpq.Q;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Insets;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.core.view.DragStartHelper;
import com.github.catvod.spider.ApplvDV2;
import com.github.catvod.spider.HBlingDu;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.Notice;
import com.github.catvod.spider.Xb6v;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E.l;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.F0.C0146c;
import com.github.catvod.spider.merge.F0.L;
import com.github.catvod.spider.merge.F0.Q;
import com.github.catvod.spider.merge.F0.S;
import com.github.catvod.spider.merge.F0.b0;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.P0.B;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.P0.n;
import com.github.catvod.spider.merge.R.a;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.T0.m;
import com.github.catvod.spider.merge.U0.C0176b;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.V0.p;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.W.v;
import com.github.catvod.spider.merge.X0.A;
import com.github.catvod.spider.merge.X0.y;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a0.C0233B;
import com.github.catvod.spider.merge.a0.C0253n;
import com.github.catvod.spider.merge.a0.DialogInterfaceOnClickListenerC0257s;
import com.github.catvod.spider.merge.a0.M;
import com.github.catvod.spider.merge.a0.W;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d.C0267b;
import com.github.catvod.spider.merge.d.C0268c;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.e.C0273c;
import com.github.catvod.spider.merge.e.C0277g;
import com.github.catvod.spider.merge.e0.C0288g;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h0.C0315D;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.t0.AbstractC0368a;
import com.github.catvod.spider.merge.w0.b;
import com.github.catvod.spider.merge.w0.g;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.d;
import com.github.catvod.spider.p000mergexbpq.P.D;
import com.github.catvod.spider.p000mergexbpq.P.w;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b.f;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.c0.c;
import com.github.catvod.spider.p000mergexbpq.c0.h;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Reader;
import java.nio.channels.Channel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.regex.Pattern;
import javax.net.ssl.SSLSocket;
import org.json.JSONObject;

/* renamed from: com.github.catvod.spider.merge-xbpq.Q.ۣۣ۟ۧۦ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0000 {

    /* renamed from: ۟ۤ۟۠ۡ, reason: not valid java name and contains not printable characters */
    public static int f153 = 330;

    /* renamed from: ۟۟۠ۡۥ, reason: not valid java name and contains not printable characters */
    public static int m1043(Object obj) {
        if (C0036.m6252() > 0) {
            return ((C0277g) obj).a;
        }
        return 0;
    }

    /* renamed from: ۟۟۠ۢۥ, reason: not valid java name and contains not printable characters */
    public static int m1044(Object obj) {
        if (C0040.m6582() >= 0) {
            return Color.parseColor((String) obj);
        }
        return 0;
    }

    /* renamed from: ۣ۟۟ۥ۟, reason: not valid java name and contains not printable characters */
    public static void m1045(Object obj, int i, int i2, int i3, int i4) {
        if (C0018.m3956() > 0) {
            ((Drawable) obj).setHotspotBounds(i, i2, i3, i4);
        }
    }

    /* renamed from: ۟۟ۥۡ, reason: not valid java name and contains not printable characters */
    public static void m1046(Object obj, int i) {
        if (C0009.m2047() > 0) {
            ((Window) obj).setGravity(i);
        }
    }

    /* renamed from: ۟۟ۦۧۨ, reason: not valid java name and contains not printable characters */
    public static Object m1047(Object obj) {
        if (C0061.m9359() <= 0) {
            return ((l) obj).b;
        }
        return null;
    }

    /* renamed from: ۟۟ۧۡ۠, reason: not valid java name and contains not printable characters */
    public static int m1048(Object obj) {
        if (C0022.m4497() >= 0) {
            return ((C0315D) obj).g;
        }
        return 0;
    }

    /* renamed from: ۟۠۟ۡۡ, reason: not valid java name and contains not printable characters */
    public static d m1049(Object obj) {
        if (C0020.m4210() < 0) {
            return ((b) obj).getOwner();
        }
        return null;
    }

    /* renamed from: ۣۣۣ۟۠, reason: not valid java name and contains not printable characters */
    public static Init m1050() {
        if (C0004.m1557() < 0) {
            return Init.get();
        }
        return null;
    }

    /* renamed from: ۟۠ۥ۠ۥ, reason: not valid java name and contains not printable characters */
    public static String m1051(Object obj) {
        if (C0029.m5282() >= 0) {
            return ((m) obj).o();
        }
        return null;
    }

    /* renamed from: ۟۠ۥۧۧ, reason: not valid java name and contains not printable characters */
    public static C0146c m1052() {
        if (C0009.m2047() > 0) {
            return C0146c.a;
        }
        return null;
    }

    /* renamed from: ۟۠ۦۤۤ, reason: not valid java name and contains not printable characters */
    public static void m1053(Object obj) throws IOException {
        if (C0031.m5628() >= 0) {
            ((Channel) obj).close();
        }
    }

    /* renamed from: ۟ۡ۠۠ۡ, reason: not valid java name and contains not printable characters */
    public static C0268c m1054(Object obj) {
        if (C0019.m4065() <= 0) {
            return ((C0267b) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۡ۠ۡۦ, reason: not valid java name and contains not printable characters */
    public static String m1055(Object obj) {
        if (C0017.m3633() <= 0) {
            return ((B) obj).a;
        }
        return null;
    }

    /* renamed from: ۟ۡ۠ۨۡ, reason: not valid java name and contains not printable characters */
    public static boolean m1056(Object obj) {
        if (C0010.m2320() < 0) {
            return ((AccessibilityNodeInfo) obj).isImportantForAccessibility();
        }
        return false;
    }

    /* renamed from: ۟ۡۢۢۤ, reason: not valid java name and contains not printable characters */
    public static boolean m1057(Object obj, Object obj2) {
        if (C0046.m7701() > 0) {
            return ((String) obj).equalsIgnoreCase((String) obj2);
        }
        return false;
    }

    /* renamed from: ۟ۡۧۦ, reason: not valid java name and contains not printable characters */
    public static int m1058(Object obj, int i) {
        if (C0018.m3956() >= 0) {
            return ((String) obj).codePointAt(i);
        }
        return 0;
    }

    /* renamed from: ۟ۢ۟۠ۨ, reason: not valid java name and contains not printable characters */
    public static void m1059(Object obj) {
        if (C0034.m6048() <= 0) {
            ((ThreadPoolExecutor) obj).shutdown();
        }
    }

    /* renamed from: ۟ۢ۠ۡۤ, reason: not valid java name and contains not printable characters */
    public static String m1060(Object obj) {
        if (C0051.m8216() <= 0) {
            return ((com.github.catvod.spider.merge.I.b) obj).m();
        }
        return null;
    }

    /* renamed from: ۣ۟ۢ۠۠, reason: not valid java name and contains not printable characters */
    public static S m1061() {
        if (C0002.m1242() > 0) {
            return A.l;
        }
        return null;
    }

    /* renamed from: ۟ۢۥۥۡ, reason: not valid java name and contains not printable characters */
    public static boolean m1062(Object obj) {
        if (C0021.m4379() >= 0) {
            return ((C0233B) obj).m;
        }
        return false;
    }

    /* renamed from: ۟ۢۦ۟, reason: not valid java name and contains not printable characters */
    public static String m1063(Object obj) {
        if (C0011.m2755() > 0) {
            return ((M) obj).m;
        }
        return null;
    }

    /* renamed from: ۟ۢۧ۟۟, reason: not valid java name and contains not printable characters */
    public static String m1064(Object obj) {
        if (C0024.m4693() <= 0) {
            return ((a) obj).j0;
        }
        return null;
    }

    /* renamed from: ۣ۟۠ۧۢ, reason: not valid java name and contains not printable characters */
    public static void m1065(Object obj, boolean z) {
        if (C0032.m5686() <= 0) {
            ((View) obj).setFocusableInTouchMode(z);
        }
    }

    /* renamed from: ۣۣ۟ۦۡ, reason: not valid java name and contains not printable characters */
    public static Pattern m1066() {
        if (C0010.m2320() < 0) {
            return ApplvDV2.f;
        }
        return null;
    }

    /* renamed from: ۣۣ۟ۤۦ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.G0.d m1067(Object obj, Object obj2, Object obj3) {
        if (C0030.m5375() > 0) {
            return ((L) obj).d((com.github.catvod.spider.merge.G0.b) obj2, (com.github.catvod.spider.merge.G0.d) obj3);
        }
        return null;
    }

    /* renamed from: ۟ۤ۟ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m1068(Object obj) {
        if (C0056.m8886() <= 0) {
            return ((Reader) obj).markSupported();
        }
        return false;
    }

    /* renamed from: ۣ۟ۤۡۨ, reason: not valid java name and contains not printable characters */
    public static void m1069(Object obj, Object obj2) {
        if (C0014.m3353() <= 0) {
            ((SSLSocket) obj).setEnabledProtocols((String[]) obj2);
        }
    }

    /* renamed from: ۟ۤۤۤۤ, reason: not valid java name and contains not printable characters */
    public static void m1070(Object obj) {
        if (C0047.m7837() > 0) {
            ((C0253n) obj).b();
        }
    }

    /* renamed from: ۟ۤۤۤۥ, reason: not valid java name and contains not printable characters */
    public static Map m1071(Object obj, Object obj2, Object obj3) {
        if (C0049.m8038() <= 0) {
            return ((HBlingDu) obj).getv((Map) obj2, (List) obj3);
        }
        return null;
    }

    /* renamed from: ۟ۤۦۢۢ, reason: not valid java name and contains not printable characters */
    public static String m1072(Object obj) {
        if (C0033.m5872() >= 0) {
            return ((com.github.catvod.spider.merge.F.m) obj).a();
        }
        return null;
    }

    /* renamed from: ۟ۥۣ۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m1073(Object obj) {
        if (C0049.m8038() <= 0) {
            return ((p) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۥۡۢۤ, reason: not valid java name and contains not printable characters */
    public static int m1074(Object obj) {
        if (C0014.m3353() < 0) {
            return ((D) obj).d();
        }
        return 0;
    }

    /* renamed from: ۟ۥۢۨۢ, reason: not valid java name and contains not printable characters */
    public static void m1075(Object obj, Object obj2) {
        if (C0061.m9359() <= 0) {
            n.c((StringBuilder) obj, (String) obj2);
        }
    }

    /* renamed from: ۟ۥۣۣۤ, reason: not valid java name and contains not printable characters */
    public static String m1076(Object obj) {
        if (C0046.m7701() > 0) {
            return ((Uri) obj).getScheme();
        }
        return null;
    }

    /* renamed from: ۟ۥۦۡۨ, reason: not valid java name and contains not printable characters */
    public static boolean m1078(Object obj) {
        if (C0020.m4210() < 0) {
            return ((com.github.catvod.spider.p000mergexbpq.c0.l) obj).a0();
        }
        return false;
    }

    /* renamed from: ۟ۦ۠ۥۤ, reason: not valid java name and contains not printable characters */
    public static Object[] m1079() {
        if (C0008.m1975() > 0) {
            return g.a;
        }
        return null;
    }

    /* renamed from: ۟ۦۣ۠ۥ, reason: not valid java name and contains not printable characters */
    public static h m1080(Object obj) {
        if (C0022.m4497() > 0) {
            return ((h) obj).r0();
        }
        return null;
    }

    /* renamed from: ۟ۦۦۢۧ, reason: not valid java name and contains not printable characters */
    public static String m1081(Object obj) {
        if (C0032.m5686() < 0) {
            return ((m) obj).H();
        }
        return null;
    }

    /* renamed from: ۟ۦۧۧۢ, reason: not valid java name and contains not printable characters */
    public static void m1082(Object obj) {
        if (C0019.m4065() < 0) {
            ((C0253n) obj).h();
        }
    }

    /* renamed from: ۟ۦۨۥۦ, reason: not valid java name and contains not printable characters */
    public static boolean m1083(Object obj, int i) {
        if (C0028.m5152() < 0) {
            return ((w) obj).j(i);
        }
        return false;
    }

    /* renamed from: ۟ۧ۟ۨۦ, reason: not valid java name and contains not printable characters */
    public static String m1084() {
        if (C0011.m2755() >= 0) {
            return "特殊分类";
        }
        return null;
    }

    /* renamed from: ۟ۧۢۧۥ, reason: not valid java name and contains not printable characters */
    public static void m1085(Object obj, Object obj2) {
        if (C0045.m7538() < 0) {
            ((TextView) obj).setEllipsize((TextUtils.TruncateAt) obj2);
        }
    }

    /* renamed from: ۣ۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m1086(Object obj) {
        if (C0031.m5628() > 0) {
            return ((com.github.catvod.spider.p000mergexbpq.n0.b) obj).b();
        }
        return null;
    }

    /* renamed from: ۟ۨۦۢ, reason: not valid java name and contains not printable characters */
    public static float m1087(Object obj) {
        if (C0051.m8216() <= 0) {
            return ((AccessibilityNodeInfo.RangeInfo) obj).getMin();
        }
        return 0.0f;
    }

    /* renamed from: ۟ۨۦۨ, reason: not valid java name and contains not printable characters */
    public static void m1088(Object obj) {
        if (C0010.m2320() <= 0) {
            ((W) obj).a();
        }
    }

    /* renamed from: ۠ۨ۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m1089() {
        if (C0035.m6140() <= 0) {
            return "调试->xpDetailContent获取列表错：";
        }
        return null;
    }

    /* renamed from: ۡ۠ۢۨ, reason: not valid java name and contains not printable characters */
    public static int m1090(Object obj) {
        if (C0058.m9131() <= 0) {
            return ((b0) obj).b;
        }
        return 0;
    }

    /* renamed from: ۡۡۤۤ, reason: not valid java name and contains not printable characters */
    public static void m1091(Object obj, Object obj2) {
        if (C0063.m9589() < 0) {
            ((SeekBar) obj).setOnSeekBarChangeListener((SeekBar.OnSeekBarChangeListener) obj2);
        }
    }

    /* renamed from: ۡۡۧۡ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.V0.d m1092(Object obj) {
        if (C0046.m7701() > 0) {
            return ((com.github.catvod.spider.merge.Y0.a) obj).a;
        }
        return null;
    }

    /* renamed from: ۡۢۥۡ, reason: not valid java name and contains not printable characters */
    public static boolean m1093(Object obj, Object obj2, Object obj3) {
        if (C0035.m6140() <= 0) {
            return ((DragStartHelper) obj).onTouch((View) obj2, (MotionEvent) obj3);
        }
        return false;
    }

    /* renamed from: ۡۤۤۦ, reason: not valid java name and contains not printable characters */
    public static void m1094(Object obj) {
        if (C0013.m3167() >= 0) {
            ((c) obj).r();
        }
    }

    /* renamed from: ۡۦۡۤ, reason: not valid java name and contains not printable characters */
    public static String m1095() {
        if (C0058.m9131() <= 0) {
            return "\\[仅?替换[:：]([^\\]]+?)\\]";
        }
        return null;
    }

    /* renamed from: ۡۦۤۥ, reason: not valid java name and contains not printable characters */
    public static String m1096(Object obj) {
        if (C0039.m6529() <= 0) {
            return String.valueOf(obj);
        }
        return null;
    }

    /* renamed from: ۣۡۧۢ, reason: not valid java name and contains not printable characters */
    public static boolean m1097(Object obj, Object obj2) {
        if (C0040.m6582() > 0) {
            return ((C0273c) obj).add(obj2);
        }
        return false;
    }

    /* renamed from: ۡۨ۠ۢ, reason: not valid java name and contains not printable characters */
    public static String m1098() {
        if (C0039.m6529() <= 0) {
            return "</a>\n </div>";
        }
        return null;
    }

    /* renamed from: ۣۣۡۨ, reason: not valid java name and contains not printable characters */
    public static String m1099(Object obj, Object obj2, Object obj3) {
        if (C0002.m1242() >= 0) {
            return ((ApplvDV2) obj).d((String) obj2, (JSONObject) obj3);
        }
        return null;
    }

    /* renamed from: ۡۨۨ۠, reason: not valid java name and contains not printable characters */
    public static int m1100(Object obj) {
        if (C0055.m8740() >= 0) {
            return ((SpannableString) obj).length();
        }
        return 0;
    }

    /* renamed from: ۡۨۨۤ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.E0.d m1101(Object obj) {
        if (C0035.m6140() <= 0) {
            return ((com.github.catvod.spider.merge.E0.m) obj).f;
        }
        return null;
    }

    /* renamed from: ۢ۟۠ۢ, reason: not valid java name and contains not printable characters */
    public static String m1102() {
        if (C0060.m9355() > 0) {
            return "解密失败！";
        }
        return null;
    }

    /* renamed from: ۣۢ۠ۡ, reason: not valid java name and contains not printable characters */
    public static int m1103(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ۢۢۤۡ, reason: not valid java name and contains not printable characters */
    public static String m1104(Object obj) {
        if (C0018.m3956() >= 0) {
            return ((com.github.catvod.spider.merge.G.a) obj).h();
        }
        return null;
    }

    /* renamed from: ۢۦۢۦ, reason: not valid java name and contains not printable characters */
    public static WindowInsets.Builder m1105(Object obj, Object obj2) {
        if (C0007.m1886() >= 0) {
            return ((WindowInsets.Builder) obj).setSystemWindowInsets((Insets) obj2);
        }
        return null;
    }

    /* renamed from: ۢۧۤۥ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.S0.a m1106() {
        if (C0055.m8740() > 0) {
            return com.github.catvod.spider.merge.S0.b.e;
        }
        return null;
    }

    /* renamed from: ۣۢۧۧ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.E0.d m1107(Object obj) {
        if (C0044.m7508() < 0) {
            return ((y) obj).e;
        }
        return null;
    }

    /* renamed from: ۢۨۡۦ, reason: not valid java name and contains not printable characters */
    public static ArrayList m1108(Object obj) {
        if (C0042.m7147() < 0) {
            return ((M) obj).u;
        }
        return null;
    }

    /* renamed from: ۢۨۨۨ, reason: not valid java name and contains not printable characters */
    public static String m1109() {
        if (C0051.m8216() <= 0) {
            return "(.*)[\\[|\\|].*";
        }
        return null;
    }

    /* renamed from: ۣ۟ۦۤ, reason: not valid java name and contains not printable characters */
    public static String m1110(Object obj, Object obj2) {
        if (C0046.m7701() >= 0) {
            return Xb6v.a((String) obj, (Pattern) obj2);
        }
        return null;
    }

    /* renamed from: ۣ۠۟ۥ, reason: not valid java name and contains not printable characters */
    public static int m1111(Object obj) {
        if (C0027.m5017() > 0) {
            return ((Q) obj).a;
        }
        return 0;
    }

    /* renamed from: ۣۡ۠ۥ, reason: not valid java name and contains not printable characters */
    public static String m1112() {
        if (C0042.m7147() < 0) {
            return "影片年代";
        }
        return null;
    }

    /* renamed from: ۣۢۦ۠, reason: not valid java name and contains not printable characters */
    public static int m1113(Object obj) {
        if (C0029.m5282() >= 0) {
            return ((D) obj).g();
        }
        return 0;
    }

    /* renamed from: ۣۨۡۥ, reason: not valid java name and contains not printable characters */
    public static void m1114(Object obj, boolean z) {
        if (C0047.m7837() > 0) {
            ((TextView) obj).setCursorVisible(z);
        }
    }

    /* renamed from: ۤۥ۟ۨ, reason: not valid java name and contains not printable characters */
    public static void m1115(Object obj, Object obj2, Object obj3) {
        if (C0032.m5686() < 0) {
            ((Notice) obj).init((Context) obj2, (String) obj3);
        }
    }

    /* renamed from: ۤۥۨ, reason: not valid java name and contains not printable characters */
    public static int m1116() {
        return 476 ^ C0043.f745;
    }

    /* renamed from: ۤۨۢۨ, reason: not valid java name and contains not printable characters */
    public static int m1117(Object obj) {
        if (C0037.m6350() < 0) {
            return ((DialogInterfaceOnClickListenerC0257s) obj).a;
        }
        return 0;
    }

    /* renamed from: ۥ۟ۤۢ, reason: contains not printable characters */
    public static Object m1118(Object obj, Object obj2) {
        if (C0053.m8389() > 0) {
            return ((AbstractC0368a) obj).invokeSuspend(obj2);
        }
        return null;
    }

    /* renamed from: ۥ۠ۡۢ, reason: contains not printable characters */
    public static Window m1119(Object obj) {
        if (C0055.m8740() > 0) {
            return ((Dialog) obj).getWindow();
        }
        return null;
    }

    /* renamed from: ۦۣ۟ۤ, reason: contains not printable characters */
    public static Boolean m1120(Object obj) {
        if (C0004.m1557() < 0) {
            return ((com.github.catvod.spider.merge.Y0.b) obj).a();
        }
        return null;
    }

    /* renamed from: ۦۣ۠۟, reason: contains not printable characters */
    public static Set m1121(Object obj) {
        if (C0017.m3633() <= 0) {
            return ((HashMap) obj).keySet();
        }
        return null;
    }

    /* renamed from: ۦۣۣۨ, reason: contains not printable characters */
    public static boolean m1122() {
        if (C0053.m8389() > 0) {
            return v.c;
        }
        return false;
    }

    /* renamed from: ۦۥۢۦ, reason: contains not printable characters */
    public static Object m1123(Object obj) {
        if (C0010.m2320() < 0) {
            return ((ListIterator) obj).next();
        }
        return null;
    }

    /* renamed from: ۦۦۣۦ, reason: contains not printable characters */
    public static Pattern m1124(Object obj) {
        if (C0032.m5686() < 0) {
            return ((a) obj).U;
        }
        return null;
    }

    /* renamed from: ۦۧۧۨ, reason: contains not printable characters */
    public static void m1125(Object obj) {
        if (C0034.m6048() <= 0) {
            com.github.catvod.spider.merge.W.n.b((WebView) obj);
        }
    }

    /* renamed from: ۦۨۥ, reason: contains not printable characters */
    public static void m1126(Object obj, Object obj2, Object obj3) {
        if (C0037.m6350() <= 0) {
            ((WebView) obj).evaluateJavascript((String) obj2, (ValueCallback) obj3);
        }
    }

    /* renamed from: ۧ۟ۥۥ, reason: not valid java name and contains not printable characters */
    public static void m1127(Object obj, Object obj2) {
        if (C0009.m2047() >= 0) {
            ((C0288g) obj).b((String) obj2);
        }
    }

    /* renamed from: ۧۥۣ۟, reason: not valid java name and contains not printable characters */
    public static String m1128(String str) {
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

    /* renamed from: ۧۨ, reason: not valid java name and contains not printable characters */
    public static Boolean m1129() {
        if (C0035.m6140() < 0) {
            return Boolean.TRUE;
        }
        return null;
    }

    /* renamed from: ۣۧۨۤ, reason: not valid java name and contains not printable characters */
    public static String m1130(Object obj, Object obj2, Object obj3) {
        if (C0002.m1242() >= 0) {
            return com.github.catvod.spider.merge.f1.b.d((String) obj, (String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۨ۠ۧۢ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.p000mergexbpq.b.p m1131(Object obj) {
        if (m1116() < 0) {
            return ((f) obj).a;
        }
        return null;
    }

    /* renamed from: ۣۨۥۢ, reason: not valid java name and contains not printable characters */
    public static void m1132(Object obj, int i) {
        if (C0051.m8216() < 0) {
            ((com.github.catvod.spider.p000mergexbpq.P.B) obj).k(i);
        }
    }

    /* renamed from: ۨۤ۠ۨ, reason: not valid java name and contains not printable characters */
    public static ArrayList m1133(Object obj) {
        if (C0015.m3433() >= 0) {
            return ((C0176b) obj).r;
        }
        return null;
    }

    /* renamed from: ۨۥ۠ۡ, reason: not valid java name and contains not printable characters */
    public static boolean m1134(Object obj, Object obj2) {
        if (C0051.m8216() < 0) {
            return g.a(obj, obj2);
        }
        return false;
    }

    /* renamed from: ۨۨ۠, reason: not valid java name and contains not printable characters */
    public static int m1135(Object obj) {
        if (C0035.m6140() <= 0) {
            return ((com.github.catvod.spider.merge.b0.d) obj).a;
        }
        return 0;
    }

    /* renamed from: ۟ۥۣۥۣ, reason: not valid java name and contains not printable characters */
    public static String m1077(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}