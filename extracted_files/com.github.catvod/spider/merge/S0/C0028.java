package com.github.catvod.spider.merge.S0;

import android.app.Activity;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.DrawableContainer;
import android.os.Environment;
import android.os.LocaleList;
import android.util.AtomicFile;
import android.webkit.WebBackForwardList;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;
import androidx.core.util.Predicate;
import com.github.catvod.spider.AppYsV2;
import com.github.catvod.spider.HBNG;
import com.github.catvod.spider.HBcms10;
import com.github.catvod.spider.HBmoou;
import com.github.catvod.spider.HBqTeng;
import com.github.catvod.spider.HBsuipian;
import com.github.catvod.spider.HBtiantian;
import com.github.catvod.spider.Market;
import com.github.catvod.spider.Miss;
import com.github.catvod.spider.NG;
import com.github.catvod.spider.Wcai;
import com.github.catvod.spider.XiaoZhiTiao;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.F0.C0149f;
import com.github.catvod.spider.merge.F0.C0150g;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.B;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.P0.h;
import com.github.catvod.spider.merge.P0.n;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.U0.O;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.V0.d;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.W.DialogInterfaceOnClickListenerC0227c;
import com.github.catvod.spider.merge.W.j;
import com.github.catvod.spider.merge.W.p;
import com.github.catvod.spider.merge.W.q;
import com.github.catvod.spider.merge.W.w;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Y0.c;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a0.C0232A;
import com.github.catvod.spider.merge.a0.C0246g;
import com.github.catvod.spider.merge.a0.C0254o;
import com.github.catvod.spider.merge.a0.I;
import com.github.catvod.spider.merge.a0.M;
import com.github.catvod.spider.merge.a0.S;
import com.github.catvod.spider.merge.a0.W;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d0.f;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.e.C0271a;
import com.github.catvod.spider.merge.e0.C0286e;
import com.github.catvod.spider.merge.e0.C0288g;
import com.github.catvod.spider.merge.e0.ViewOnFocusChangeListenerC0284c;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.g0.AbstractC0309d;
import com.github.catvod.spider.merge.h0.C0340u;
import com.github.catvod.spider.merge.h0.DialogInterfaceOnClickListenerC0318G;
import com.github.catvod.spider.merge.h0.RunnableC0317F;
import com.github.catvod.spider.merge.h0.RunnableC0337q;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.l0.l;
import com.github.catvod.spider.merge.l0.m;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.v.AbstractC0376b;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.y0.e;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.d0.P;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.regex.Pattern;
import org.json.JSONArray;

/* renamed from: com.github.catvod.spider.merge.S0.۟۠ۦۧۢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0028 {

    /* renamed from: ۣۣ۟ۡۦ, reason: not valid java name and contains not printable characters */
    public static int f495 = -688;

    /* renamed from: ۟۟۠ۡۤ, reason: not valid java name and contains not printable characters */
    public static String m5104() {
        if (C0025.m4797() > 0) {
            return "{\"网游\": [{\"key\": \"class\", \"name\": \"类型\", \"value\": [{\"n\": \"英雄联盟\", \"v\": \"英雄联盟\"},  {\"n\": \"无畏契约\", \"v\": \"无畏契约\"}, {\"n\": \"CS:GO\", \"v\": \"CS:GO\"}, {\"n\": \"APEX英雄\", \"v\": \"APEX英雄\"}, {\"n\": \"永劫无间\", \"v\": \"永劫无间\"}, {\"n\": \"穿越火线\", \"v\": \"穿越火线\"}, {\"n\": \"命运方舟\", \"v\": \"命运方舟\"}, {\"n\": \"DOTA2\", \"v\": \"DOTA2\"}, {\"n\": \"吃鸡行动\", \"v\": \"吃鸡行动\"},  {\"n\": \"逃离塔科夫\", \"v\": \"逃离塔科夫\"}, {\"n\": \"传奇\", \"v\": \"传奇\"}, {\"n\": \"DNF\", \"v\": \"DNF\"}, {\"n\": \"卡拉彼丘\", \"v\": \"卡拉彼丘\"}, {\"n\": \"幕后高手\", \"v\": \"幕后高手\"}, {\"n\": \"生死狙击2\", \"v\": \"生死狙击2\"}, {\"n\": \"洛奇英雄传\", \"v\": \"洛奇英雄传\"}, {\"n\": \"最终幻想14\", \"v\": \"最终幻想14\"}, {\"n\": \"重生边缘\", \"v\": \"重生边缘\"}, {\"n\": \"星际战甲\", \"v\": \"星际战甲\"}, {\"n\": \"梦三国\", \"v\": \"梦三国\"}, {\"n\": \"英魂之刃\", \"v\": \"英魂之刃\"}, {\"n\": \"剑网3\", \"v\": \"剑网3\"}]}], \"手游\": [{\"key\": \"class\", \"name\": \"类型\", \"value\": [{\"n\": \"王者荣耀\", \"v\": \"王者荣耀\"}, {\"n\": \"和平精英\", \"v\": \"和平精英\"}, {\"n\": \"原神\", \"v\": \"原神\"}, {\"n\": \"崩坏：星穹铁道\", \"v\": \"崩坏：星穹铁道\"}, {\"n\": \"第五人格\", \"v\": \"第五人格\"}, {\"n\": \"LOL手游\", \"v\": \"LOL手游\"}, {\"n\": \"明日方舟\", \"v\": \"明日方舟\"}, {\"n\": \"黎明觉醒：生机\", \"v\": \"黎明觉醒：生机\"}, {\"n\": \"蛋仔派对\", \"v\": \"蛋仔派对\"}, {\"n\": \"冒险岛手游\", \"v\": \"冒险岛手游\"}, {\"n\": \"闪耀！优俊少女\", \"v\": \"闪耀！优俊少女\"}, {\"n\": \"斯露德\", \"v\": \"斯露德\"}, {\"n\": \"千年之旅\", \"v\": \"千年之旅\"}, {\"n\": \"白夜极光\", \"v\": \"白夜极光\"}, {\"n\": \"逆水寒手游\", \"v\": \"逆水寒手游\"}, {\"n\": \"率土之滨\", \"v\": \"率土之滨\"}, {\"n\": \"月圆之夜\", \"v\": \"月圆之夜\"}]}],\"单机\": [{\"key\": \"class\", \"name\": \"类型\", \"value\": [{\"n\": \"主机游戏\", \"v\": \"主机游戏\"}, {\"n\": \"我的世界\", \"v\": \"我的世界\"}, {\"n\": \"独立游戏\", \"v\": \"独立游戏\"}, {\"n\": \"怀旧游戏\", \"v\": \"怀旧游戏\"}, {\"n\": \"猛兽派对\", \"v\": \"猛兽派对\"}, {\"n\": \"星空\", \"v\": \"星空\"}, {\"n\": \"塞尔达传说\", \"v\": \"塞尔达传说\"}, {\"n\": \"苍翼：混沌效应\", \"v\": \"苍翼：混沌效应\"}, {\"n\": \"命运2\", \"v\": \"命运2\"}, {\"n\": \"收获日3\", \"v\": \"收获日3\"}, {\"n\": \"机战佣兵VI 境界天火\", \"v\": \"机战佣兵VI 境界天火\"}, {\"n\": \"暗黑破坏神Ⅳ\", \"v\": \"暗黑破坏神Ⅳ\"}, {\"n\": \"匹诺曹的谎言\", \"v\": \"匹诺曹的谎言\"}, {\"n\": \"博德之门3\", \"v\": \"博德之门3\"}, {\"n\": \"绝世好武功\", \"v\": \"绝世好武功\"}, {\"n\": \"恐怖游戏\", \"v\": \"恐怖游戏\"}, {\"n\": \"Dark and Darker\", \"v\": \"Dark and Darker\"}, {\"n\": \"Warlander\", \"v\": \"Warlander\"}, {\"n\": \"FORZA 极限竞速\", \"v\": \"FORZA 极限竞速\"}, {\"n\": \"边境\", \"v\": \"边境\"}, {\"n\": \"生化危机\", \"v\": \"生化危机\"}]}], \"娱乐\": [{\"key\": \"class\", \"name\": \"类型\", \"value\": [{\"n\": \"聊天室\", \"v\": \"聊天室\"}, {\"n\": \"视频唱见\", \"v\": \"视频唱见\"}, {\"n\": \"萌宅领域\", \"v\": \"萌宅领域\"}, {\"n\": \"视频聊天\", \"v\": \"视频聊天\"}, {\"n\": \"舞见\", \"v\": \"舞见\"}, {\"n\": \"唱见电台\", \"v\": \"唱见电台\"}, {\"n\": \"聊天电台\", \"v\": \"聊天电台\"}, {\"n\": \"甜宠电台\", \"v\": \"甜宠电台\"}, {\"n\": \"TopStar\", \"v\": \"TopStar\"}, {\"n\": \"虚拟Singer\", \"v\": \"虚拟Singer\"}, {\"n\": \"虚拟Gamer\", \"v\": \"虚拟Gamer\"}, {\"n\": \"虚拟声优\", \"v\": \"虚拟声优\"}, {\"n\": \"虚拟日常\", \"v\": \"虚拟日常\"}, {\"n\": \"星秀\", \"v\": \"星秀\"}]}], \"其他\": [{\"key\": \"class\", \"name\": \"类型\", \"value\": [{\"n\": \"生活分享\", \"v\": \"生活分享\"}, {\"n\": \"户外\", \"v\": \"户外\"}, {\"n\": \"日常\", \"v\": \"日常\"}, {\"n\": \"情感\", \"v\": \"情感\"}, {\"n\": \"运动\", \"v\": \"运动\"}, {\"n\": \"搞笑\", \"v\": \"搞笑\"}, {\"n\": \"手工绘画\", \"v\": \"手工绘画\"}, {\"n\": \"萌宠\", \"v\": \"萌宠\"}, {\"n\": \"美食\", \"v\": \"美食\"}, {\"n\": \"时尚\", \"v\": \"时尚\"}, {\"n\": \"社科法律心理\", \"v\": \"社科法律心理\"}, {\"n\": \"人文历史\", \"v\": \"人文历史\"}, {\"n\": \"校园学习\", \"v\": \"校园学习\"}, {\"n\": \"职场·技能\", \"v\": \"职场·技能\"}, {\"n\": \"科技\", \"v\": \"科技\"}]}]}";
        }
        return null;
    }

    /* renamed from: ۟۟۠ۥۦ, reason: not valid java name and contains not printable characters */
    public static String[] m5105() {
        if (C0036.m6252() >= 0) {
            return com.github.catvod.spider.merge.V.b.c;
        }
        return null;
    }

    /* renamed from: ۟۟ۡۧ۠, reason: not valid java name and contains not printable characters */
    public static String m5106(Object obj) {
        if (C0042.m7147() < 0) {
            return P.o((String) obj);
        }
        return null;
    }

    /* renamed from: ۟۟ۥۨۥ, reason: not valid java name and contains not printable characters */
    public static UUID m5107() {
        if (C0000.m1116() < 0) {
            return C0150g.c;
        }
        return null;
    }

    /* renamed from: ۟۟ۧۧ۠, reason: not valid java name and contains not printable characters */
    public static String m5108(Object obj) {
        if (C0021.m4379() > 0) {
            return ((HBtiantian) obj).b;
        }
        return null;
    }

    /* renamed from: ۟۟ۨۨ, reason: not valid java name and contains not printable characters */
    public static LinkedHashMap m5110(Object obj) {
        if (C0042.m7147() <= 0) {
            return ((com.github.catvod.spider.merge.R.a) obj).h;
        }
        return null;
    }

    /* renamed from: ۟۠ۡۡۨ, reason: not valid java name and contains not printable characters */
    public static C0288g m5111(Object obj) {
        if (C0042.m7147() < 0) {
            return C0288g.d((Activity) obj);
        }
        return null;
    }

    /* renamed from: ۟۠ۢ۠۠, reason: not valid java name and contains not printable characters */
    public static String m5112(Object obj, Object obj2, boolean z) {
        if (C0030.m5375() > 0) {
            return ((HBcms10) obj).searchContent((String) obj2, z);
        }
        return null;
    }

    /* renamed from: ۟۠ۢ۠ۡ, reason: not valid java name and contains not printable characters */
    public static int m5113(Object obj) {
        if (C0055.m8740() >= 0) {
            return C0055.m8727((Calendar) obj);
        }
        return 0;
    }

    /* renamed from: ۣ۟۠ۡۥ, reason: not valid java name and contains not printable characters */
    public static int m5114(Object obj) {
        if (C0031.m5628() > 0) {
            return ((CharSequence) obj).length();
        }
        return 0;
    }

    /* renamed from: ۣ۟۠ۥۤ, reason: not valid java name and contains not printable characters */
    public static HashMap m5115(Object obj) {
        if (C0062.m9429() > 0) {
            return ((HBmoou) obj).a();
        }
        return null;
    }

    /* renamed from: ۟۠ۤۥ۟, reason: not valid java name and contains not printable characters */
    public static int m5116(Object obj) {
        if (C0037.m6350() <= 0) {
            return ((j) obj).a;
        }
        return 0;
    }

    /* renamed from: ۟۠ۦ۠ۦ, reason: not valid java name and contains not printable characters */
    public static Serializable m5117(Object obj) {
        if (C0058.m9131() <= 0) {
            return ((C0246g) obj).i;
        }
        return null;
    }

    /* renamed from: ۣ۟۠ۧۡ, reason: not valid java name and contains not printable characters */
    public static Pattern m5118(Object obj) {
        if (C0035.m6140() <= 0) {
            return ((com.github.catvod.spider.merge.R.a) obj).X;
        }
        return null;
    }

    /* renamed from: ۟۠ۨ۠۠, reason: not valid java name and contains not printable characters */
    public static String m5119(Object obj) {
        if (C0023.m4566() <= 0) {
            return ((LocaleList) obj).toLanguageTags();
        }
        return null;
    }

    /* renamed from: ۟۠ۨۨ, reason: not valid java name and contains not printable characters */
    public static Predicate m5120(Object obj, Object obj2) {
        if (C0002.m1242() > 0) {
            return AbstractC0376b.c((Predicate) obj, (Predicate) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۡۡۦ۟, reason: not valid java name and contains not printable characters */
    public static String m5121(Object obj, int i) {
        if (C0043.m7332() >= 0) {
            return ((JSONArray) obj).optString(i);
        }
        return null;
    }

    /* renamed from: ۣ۟ۡۤۢ, reason: not valid java name and contains not printable characters */
    public static ConcurrentMap[] m5122() {
        if (C0003.m1463() < 0) {
            return n.i;
        }
        return null;
    }

    /* renamed from: ۟ۡۥۦ, reason: not valid java name and contains not printable characters */
    public static List m5123(Object obj) {
        if (C0016.m3596() <= 0) {
            return ((Market) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۡۦۤ, reason: not valid java name and contains not printable characters */
    public static boolean m5124(Object obj) {
        if (C0009.m2047() >= 0) {
            return ((e) obj).isInfix();
        }
        return false;
    }

    /* renamed from: ۟ۢ۟ۡۤ, reason: not valid java name and contains not printable characters */
    public static S m5125(Object obj) {
        if (C0036.m6252() >= 0) {
            return ((DialogInterfaceOnClickListenerC0318G) obj).b;
        }
        return null;
    }

    /* renamed from: ۣ۟ۢ۠ۦ, reason: not valid java name and contains not printable characters */
    public static void m5126(Object obj, int i) {
        if (C0015.m3433() > 0) {
            ((DrawableContainer) obj).setExitFadeDuration(i);
        }
    }

    /* renamed from: ۟ۢۡۤۨ, reason: not valid java name and contains not printable characters */
    public static Object m5127(Object obj) {
        if (C0039.m6529() <= 0) {
            return ((f) obj).c;
        }
        return null;
    }

    /* renamed from: ۟ۢۤۥۥ, reason: not valid java name and contains not printable characters */
    public static String m5128() {
        if (C0064.m9659() < 0) {
            return "btwaf";
        }
        return null;
    }

    /* renamed from: ۟ۢۥۦۤ, reason: not valid java name and contains not printable characters */
    public static int m5129(Object obj) {
        if (C0035.m6140() <= 0) {
            return ((DialogInterfaceOnClickListenerC0227c) obj).a;
        }
        return 0;
    }

    /* renamed from: ۟ۢۦۨ, reason: not valid java name and contains not printable characters */
    public static void m5130(Object obj) {
        if (C0015.m3433() > 0) {
            ((d) obj).h();
        }
    }

    /* renamed from: ۣ۟۟ۥۥ, reason: not valid java name and contains not printable characters */
    public static String m5131() {
        if (C0060.m9355() > 0) {
            return ".*,(.*)";
        }
        return null;
    }

    /* renamed from: ۣ۟۟ۦۣ, reason: not valid java name and contains not printable characters */
    public static int m5132(Object obj) {
        if (C0014.m3353() < 0) {
            return ((B) obj).hashCode();
        }
        return 0;
    }

    /* renamed from: ۣ۟ۢۦۨ, reason: not valid java name and contains not printable characters */
    public static Object m5133(Object obj, Object obj2) {
        if (C0056.m8886() < 0) {
            return ((com.github.catvod.spider.merge.X0.n) obj).a((c) obj2);
        }
        return null;
    }

    /* renamed from: ۣۣ۟ۧ۠, reason: not valid java name and contains not printable characters */
    public static boolean m5134(Object obj) {
        if (C0003.m1463() <= 0) {
            return b.d((String) obj);
        }
        return false;
    }

    /* renamed from: ۣ۟ۨۧۥ, reason: not valid java name and contains not printable characters */
    public static void m5135(boolean z) {
        if (C0008.m1975() >= 0) {
            WebView.setWebContentsDebuggingEnabled(z);
        }
    }

    /* renamed from: ۟ۤ۟ۦۤ, reason: not valid java name and contains not printable characters */
    public static String m5136() {
        if (C0016.m3596() <= 0) {
            return "\" onclick=\"handleManualEpisodeClick(this)\" tabindex=\"0\" >";
        }
        return null;
    }

    /* renamed from: ۟ۤۡ۟ۧ, reason: not valid java name and contains not printable characters */
    public static char[] m5137() {
        if (C0051.m8216() < 0) {
            return AbstractC0309d.a;
        }
        return null;
    }

    /* renamed from: ۟ۤۢۡۡ, reason: not valid java name and contains not printable characters */
    public static boolean m5138(Object obj) {
        if (C0016.m3596() <= 0) {
            return ((RunnableC0317F) obj).a;
        }
        return false;
    }

    /* renamed from: ۣ۟ۤۤۨ, reason: not valid java name and contains not printable characters */
    public static m m5139(Object obj) {
        if (C0023.m4566() <= 0) {
            return ((l) obj).d;
        }
        return null;
    }

    /* renamed from: ۟ۤۤۧۢ, reason: not valid java name and contains not printable characters */
    public static FileOutputStream m5140(Object obj) {
        if (C0027.m5017() > 0) {
            return ((AtomicFile) obj).startWrite();
        }
        return null;
    }

    /* renamed from: ۟ۤۧۧۤ, reason: not valid java name and contains not printable characters */
    public static boolean m5141(Object obj) {
        if (C0012.m3024() > 0) {
            return ((M) obj).h;
        }
        return false;
    }

    /* renamed from: ۟ۥ۠ۧ۟, reason: not valid java name and contains not printable characters */
    public static String m5142(Object obj, Object obj2, boolean z, Object obj3) {
        if (C0063.m9589() <= 0) {
            return ((HBsuipian) obj).searchContent((String) obj2, z, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۟ۥۣۨۥ, reason: not valid java name and contains not printable characters */
    public static HashMap m5143(Object obj) {
        if (C0001.m1164() < 0) {
            return ((C0232A) obj).d();
        }
        return null;
    }

    /* renamed from: ۟ۥۤۡ۟, reason: not valid java name and contains not printable characters */
    public static String m5144(Object obj) {
        if (C0023.m4566() <= 0) {
            return com.github.catvod.spider.merge.a1.b.b((String) obj);
        }
        return null;
    }

    /* renamed from: ۟ۥۥ۟ۥ, reason: not valid java name and contains not printable characters */
    public static HashMap m5145(Object obj) {
        if (C0017.m3633() <= 0) {
            return ((W) obj).p();
        }
        return null;
    }

    /* renamed from: ۟ۥۣۧۡ, reason: not valid java name and contains not printable characters */
    public static Date m5146(Object obj) {
        if (C0018.m3956() >= 0) {
            return ((XiaoZhiTiao) obj).c;
        }
        return null;
    }

    /* renamed from: ۟ۦ۟۟ۧ, reason: not valid java name and contains not printable characters */
    public static void m5147(Object obj, Object obj2) {
        if (C0033.m5872() >= 0) {
            ((ImageView) obj).setScaleType((ImageView.ScaleType) obj2);
        }
    }

    /* renamed from: ۟ۦ۟ۦۨ, reason: not valid java name and contains not printable characters */
    public static long m5148(Object obj) {
        if (C0036.m6252() > 0) {
            return ((Number) obj).longValue();
        }
        return 0L;
    }

    /* renamed from: ۟ۦۣۣۢ, reason: not valid java name and contains not printable characters */
    public static int m5149(Object obj) {
        if (C0063.m9589() <= 0) {
            return ((com.github.catvod.spider.p000mergexbpq.R.e) obj).a;
        }
        return 0;
    }

    /* renamed from: ۟ۦۣۨۢ, reason: not valid java name and contains not printable characters */
    public static void m5150(Object obj, boolean z) {
        if (C0042.m7147() <= 0) {
            ((WebSettings) obj).setDisplayZoomControls(z);
        }
    }

    /* renamed from: ۟ۦۥۧۧ, reason: not valid java name and contains not printable characters */
    public static long m5151(Object obj) {
        if (C0050.m8121() <= 0) {
            return ((com.github.catvod.spider.merge.l0.j) obj).d;
        }
        return 0L;
    }

    /* renamed from: ۟ۦۨۧۡ, reason: not valid java name and contains not printable characters */
    public static int m5152() {
        return (-619) ^ C0045.f758;
    }

    /* renamed from: ۟ۧۤۤۦ, reason: not valid java name and contains not printable characters */
    public static int m5153(Object obj, int i, Object obj2, Object obj3) {
        if (C0012.m3024() >= 0) {
            return C0150g.c((char[]) obj, i, (ArrayList) obj2, (C0149f) obj3);
        }
        return 0;
    }

    /* renamed from: ۟ۧۦۧۥ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.p000mergexbpq.d.f m5154(Object obj) {
        if (C0060.m9355() >= 0) {
            return ((com.github.catvod.spider.p000mergexbpq.d.f) obj).e();
        }
        return null;
    }

    /* renamed from: ۠۟۟ۡ, reason: not valid java name and contains not printable characters */
    public static C0340u m5155(Object obj) {
        if (C0002.m1242() >= 0) {
            return ((RunnableC0337q) obj).b;
        }
        return null;
    }

    /* renamed from: ۠ۦ۠ۢ, reason: not valid java name and contains not printable characters */
    public static HashMap m5156() {
        if (C0016.m3596() <= 0) {
            return HBqTeng.a();
        }
        return null;
    }

    /* renamed from: ۡۤ۠, reason: not valid java name and contains not printable characters */
    public static String m5157(Object obj, Object obj2) {
        if (C0035.m6140() < 0) {
            return Miss.a((String) obj, (String) obj2);
        }
        return null;
    }

    /* renamed from: ۡۦۦ, reason: not valid java name and contains not printable characters */
    public static Boolean m5158(Object obj) {
        if (C0034.m6048() <= 0) {
            return ((com.github.catvod.spider.merge.G.a) obj).j();
        }
        return null;
    }

    /* renamed from: ۢ۠۟ۡ, reason: not valid java name and contains not printable characters */
    public static void m5159(Object obj, Object obj2, int i, int i2, Object obj3) {
        if (C0004.m1557() < 0) {
            ((Paint) obj).getTextBounds((String) obj2, i, i2, (Rect) obj3);
        }
    }

    /* renamed from: ۢۡۨ, reason: not valid java name and contains not printable characters */
    public static String m5160(String str) {
        String string = "";
        int i = 0;
        String str2 = "";
        while (i < 15) {
            string = new StringBuffer().append(string).append(Integer.toHexString(i)).toString();
            String string2 = new StringBuffer().append(str2).append(((int) (Math.random() * 10)) ^ i).toString();
            i++;
            str2 = string2;
        }
        while (string.length() > 0) {
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length() / 2);
        for (int i2 = 0; i2 < str.length(); i2 += 2) {
            byteArrayOutputStream.write((string.indexOf(str.charAt(i2)) << 4) | string.indexOf(str.charAt(i2 + 1)));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        int length2 = str2.length();
        for (int i3 = 0; i3 < length; i3++) {
            byteArray[i3] = (byte) (byteArray[i3] ^ str2.charAt(i3 % length2));
        }
        return new String(byteArray);
    }

    /* renamed from: ۢۢۤ, reason: not valid java name and contains not printable characters */
    public static Object m5161(Object obj, int i) {
        if (C0032.m5686() < 0) {
            return ((AbstractList) obj).get(i);
        }
        return null;
    }

    /* renamed from: ۣۣۢ, reason: not valid java name and contains not printable characters */
    public static String m5162() {
        if (C0044.m7508() <= 0) {
            return "playUrl";
        }
        return null;
    }

    /* renamed from: ۣۣۢۡ, reason: not valid java name and contains not printable characters */
    public static String m5163() {
        if (C0055.m8740() >= 0) {
            return "分类起始页码";
        }
        return null;
    }

    /* renamed from: ۢۦۨۨ, reason: not valid java name and contains not printable characters */
    public static String m5164(Object obj) {
        if (C0018.m3956() > 0) {
            return ((AppYsV2) obj).b();
        }
        return null;
    }

    /* renamed from: ۢۧ۟ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m5165(Object obj) {
        if (C0052.m8320() > 0) {
            return ((com.github.catvod.spider.merge.l0.j) obj).j;
        }
        return false;
    }

    /* renamed from: ۣ۟ۥۧ, reason: not valid java name and contains not printable characters */
    public static ArrayList m5166(Object obj) {
        if (C0002.m1242() >= 0) {
            return ((com.github.catvod.spider.merge.X.a) obj).b;
        }
        return null;
    }

    /* renamed from: ۣ۠ۢۢ, reason: not valid java name and contains not printable characters */
    public static Object m5167(Object obj, int i) {
        if (C0035.m6140() < 0) {
            return ((ArrayList) obj).get(i);
        }
        return null;
    }

    /* renamed from: ۤ۟ۡۧ, reason: not valid java name and contains not printable characters */
    public static h m5168() {
        if (C0012.m3024() >= 0) {
            return n.s;
        }
        return null;
    }

    /* renamed from: ۤ۠ۤ۠, reason: not valid java name and contains not printable characters */
    public static String m5169(Object obj) {
        if (C0032.m5686() < 0) {
            return ((NG.Rst) obj).b;
        }
        return null;
    }

    /* renamed from: ۤۢ۠۟, reason: not valid java name and contains not printable characters */
    public static HashMap m5170(Object obj) {
        if (C0005.m1599() < 0) {
            return HBNG.b((String) obj);
        }
        return null;
    }

    /* renamed from: ۤۤۦۦ, reason: not valid java name and contains not printable characters */
    public static Map m5171(Object obj) {
        if (C0044.m7508() < 0) {
            return ((C0271a) obj).c();
        }
        return null;
    }

    /* renamed from: ۤۦ۠ۡ, reason: not valid java name and contains not printable characters */
    public static String m5172(Object obj, Object obj2, Object obj3) {
        if (C0048.m7971() >= 0) {
            return com.github.catvod.spider.merge.B0.a.k((String) obj, (String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۤۦۧۤ, reason: not valid java name and contains not printable characters */
    public static Activity m5173(Object obj) {
        if (C0008.m1975() > 0) {
            return ((w) obj).c();
        }
        return null;
    }

    /* renamed from: ۤۨ۟ۢ, reason: not valid java name and contains not printable characters */
    public static String m5174() {
        if (C0022.m4497() >= 0) {
            return "category";
        }
        return null;
    }

    /* renamed from: ۥ۠ۢۧ, reason: contains not printable characters */
    public static String m5175(Object obj, Object obj2) {
        if (C0048.m7971() >= 0) {
            return ((com.github.catvod.spider.merge.T0.c) obj).d((String) obj2);
        }
        return null;
    }

    /* renamed from: ۥۢۡۦ, reason: contains not printable characters */
    public static Enumeration m5176(Object obj) {
        if (C0002.m1242() > 0) {
            return ClassLoader.getSystemResources((String) obj);
        }
        return null;
    }

    /* renamed from: ۥۥۤۥ, reason: contains not printable characters */
    public static Object m5177(Object obj, Object obj2) {
        if (C0004.m1557() <= 0) {
            return ((c) obj).c((com.github.catvod.spider.merge.I0.b) obj2);
        }
        return null;
    }

    /* renamed from: ۥۧ۟, reason: contains not printable characters */
    public static String m5178() {
        if (C0057.m9017() >= 0) {
            return Wcai.b();
        }
        return null;
    }

    /* renamed from: ۥۣۧۨ, reason: contains not printable characters */
    public static ScheduledExecutorService m5179(Object obj) {
        if (C0024.m4693() < 0) {
            return ((M) obj).j;
        }
        return null;
    }

    /* renamed from: ۦۣ۠۠, reason: contains not printable characters */
    public static String m5180(Object obj, Object obj2) {
        if (C0053.m8389() >= 0) {
            return ((C0254o) obj).m((String) obj2);
        }
        return null;
    }

    /* renamed from: ۦ۠ۥۤ, reason: contains not printable characters */
    public static String m5181(Object obj) {
        if (C0035.m6140() < 0) {
            return ((com.github.catvod.spider.merge.M.e) obj).c();
        }
        return null;
    }

    /* renamed from: ۦۡۤۦ, reason: contains not printable characters */
    public static Object m5182(Object obj, Object obj2) {
        if (C0060.m9355() > 0) {
            return ((Field) obj).get(obj2);
        }
        return null;
    }

    /* renamed from: ۦۤ۠ۡ, reason: contains not printable characters */
    public static WebBackForwardList m5183() {
        if (C0046.m7701() >= 0) {
            return p.d;
        }
        return null;
    }

    /* renamed from: ۦۤۧۧ, reason: contains not printable characters */
    public static boolean m5184(Object obj) {
        if (C0038.m6471() > 0) {
            return ((O) obj).g();
        }
        return false;
    }

    /* renamed from: ۦۧ۠ۦ, reason: contains not printable characters */
    public static String m5185() {
        if (C0034.m6048() <= 0) {
            return "    </div>\n</div>\n\n<script>\n    // 安卓4.0 webview兼容性处理\n    if (!window.fetch) {\n        window.fetch = function(url, options) {\n            return new Promise(function(resolve, reject) {\n                var xhr = new XMLHttpRequest();\n                xhr.open(options && options.method || 'GET', url);\n                xhr.onload = function() {\n                    resolve({\n                        ok: xhr.status >= 200 && xhr.status < 300,\n                        status: xhr.status,\n                        text: function() { return Promise.resolve(xhr.responseText); }\n                    });\n                };\n                xhr.onerror = function() {\n                    reject(new Error('网络错误'));\n                };\n                xhr.send(options && options.body);\n            });\n        };\n    }\n    \n    // 全局变量存储弹幕面板引用\n    let danmuPanel = null;\n    let isPanelVisible = false;\n    \n    // 初始化页面\n    function initPage() {\n        setupEventListeners();\n    }\n\n    // 处理集数点击\n    function handleManualEpisodeClick(btn) {\n        const episode = {\n            num: btn.textContent.trim(),\n            url: btn.getAttribute('data-url')\n        };\n        handleEpisodeClick(episode, btn);\n    }\n    \n    // 处理集数点击\n    function handleEpisodeClick(episode, btn) {\n        // 重置所有按钮状态\n        document.querySelectorAll('.episode-btn').forEach(b => {\n            b.classList.remove('active', 'error');\n        });\n\n        // 设置当前按钮为活动状态\n        btn.classList.add('active');\n\n        // 发送请求\n        const formData = new FormData();\n        formData.append('_background', '1');\n\n        const success = navigator.sendBeacon(episode.url, formData);\n\n        if (success) {\n            showMessage('弹幕已推送:' + episode.num, 'success');\n            btn.classList.add('active');\n        } else {\n            showMessage('推送失败，请重试', 'error');\n            btn.classList.add('error');\n        }\n        setTimeout(() => {\n            btn.classList.remove('active', 'error');\n        }, 3000);\n    }\n\n    // 切换弹幕表单显示/隐藏\n    function toggleDanmuForm() {\n        const danmuToggleBtn = document.getElementById('danmuToggleBtn');\n        const container = document.getElementById('pushSectionContainer');\n        \n        if (isPanelVisible) {\n            // 隐藏面板：从DOM中移除\n            if (danmuPanel && danmuPanel.parentNode) {\n                danmuPanel.parentNode.removeChild(danmuPanel);\n            }\n            danmuPanel = null;\n            danmuToggleBtn.textContent = '📝 发送弹幕';\n        } else {\n            // 显示面板：创建并添加到DOM\n            createDanmuPanel();\n            container.appendChild(danmuPanel);\n            danmuToggleBtn.textContent = '📝 折叠弹幕';\n            \n            // 显示后聚焦到第一个输入框\n            setTimeout(() => {\n                const messageInput = document.getElementById('message');\n                if (messageInput) messageInput.focus();\n            }, 100);\n        }\n        isPanelVisible = !isPanelVisible;\n    }\n    \n    // 创建弹幕面板\n    function createDanmuPanel() {\n        // 创建面板容器\n        danmuPanel = document.createElement('div');\n        danmuPanel.className = 'push-section';\n        danmuPanel.id = 'pushSection';\n        \n        // 设置面板内容\n        danmuPanel.innerHTML = `\n            <div class=\"push-title\">📝 发送弹幕</div>\n            <form id=\"danmuForm\">\n                <div class=\"input-group\">\n                    <label for=\"message\">弹幕内容：</label>\n                    <textarea id=\"message\" placeholder=\"请输入要发送的弹幕内容...\" tabindex=\"0\"></textarea>\n                </div>\n                <div class=\"input-group\">\n                    <label for=\"username\">昵称：</label>\n                    <input id=\"username\" placeholder=\"请输入您的昵称...\" value=\"";
        }
        return null;
    }

    /* renamed from: ۦۨۥۤ, reason: contains not printable characters */
    public static Boolean m5186(boolean z) {
        if (C0011.m2755() > 0) {
            return Boolean.valueOf(z);
        }
        return null;
    }

    /* renamed from: ۧ۠ۢۧ, reason: not valid java name and contains not printable characters */
    public static boolean m5187(Object obj) {
        if (C0061.m9359() < 0) {
            return ((File) obj).exists();
        }
        return false;
    }

    /* renamed from: ۧۡ۟ۥ, reason: not valid java name and contains not printable characters */
    public static String m5188(Object obj, Object obj2, Object obj3) {
        if (C0013.m3167() >= 0) {
            return com.github.catvod.spider.merge.f1.b.f((StringBuilder) obj, (String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۧۡۨۢ, reason: not valid java name and contains not printable characters */
    public static int m5189(Object obj) {
        if (C0053.m8389() >= 0) {
            return ((ViewOnFocusChangeListenerC0284c) obj).a;
        }
        return 0;
    }

    /* renamed from: ۧۧ۠ۨ, reason: not valid java name and contains not printable characters */
    public static int m5190(Object obj) {
        if (C0002.m1242() >= 0) {
            return ((com.github.catvod.spider.merge.K0.c) obj).c;
        }
        return 0;
    }

    /* renamed from: ۧۨ۠ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m5191(Object obj) {
        if (C0025.m4797() > 0) {
            return ((q) obj).g;
        }
        return false;
    }

    /* renamed from: ۧۨۤ۟, reason: not valid java name and contains not printable characters */
    public static HashMap m5192() {
        if (C0061.m9359() < 0) {
            return com.github.catvod.spider.merge.d1.a.c;
        }
        return null;
    }

    /* renamed from: ۨۢۥۣ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.G0.c[] m5193(Object obj) {
        if (C0026.m4977() <= 0) {
            return ((com.github.catvod.spider.merge.G0.d) obj).h;
        }
        return null;
    }

    /* renamed from: ۨۤ۟, reason: not valid java name and contains not printable characters */
    public static File m5194(Object obj) {
        if (C0038.m6471() > 0) {
            return Environment.getExternalStoragePublicDirectory((String) obj);
        }
        return null;
    }

    /* renamed from: ۨۥۢۤ, reason: not valid java name and contains not printable characters */
    public static String m5195() {
        if (C0042.m7147() <= 0) {
            return "#";
        }
        return null;
    }

    /* renamed from: ۨۧۥ۠, reason: not valid java name and contains not printable characters */
    public static C0286e m5196(Object obj) {
        if (C0029.m5282() > 0) {
            return ((C0288g) obj).d;
        }
        return null;
    }

    /* renamed from: ۨۧۥۣ, reason: not valid java name and contains not printable characters */
    public static int m5197(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ۣۨۨ, reason: not valid java name and contains not printable characters */
    public static M m5198(Object obj) {
        if (C0000.m1116() < 0) {
            return ((I) obj).b;
        }
        return null;
    }

    /* renamed from: ۟۟ۨۦۤ, reason: not valid java name and contains not printable characters */
    public static String m5109(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}