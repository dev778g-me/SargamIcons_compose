package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiLanding: ImageVector
    get() {
        if (_SiLanding != null) {
            return _SiLanding!!
        }
        _SiLanding = ImageVector.Builder(
            name = "Regular.SiLanding",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveToRelative(19.813f, 11.376f)
                lineToRelative(-4.25f, -0.641f)
                lineToRelative(-4.786f, -5.106f)
                arcToRelative(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.104f, -0.601f)
                lineToRelative(-1.27f, -0.218f)
                lineToRelative(2.643f, 5.037f)
                lineToRelative(-5.443f, -0.897f)
                lineToRelative(-0.947f, -1.057f)
                arcToRelative(2.04f, 2.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.271f, -0.837f)
                lineToRelative(-0.96f, -0.18f)
                lineTo(3.77f, 10.67f)
                lineToRelative(5.578f, 2.958f)
                lineToRelative(11.813f, 2.032f)
                lineToRelative(0.317f, -1.976f)
                curveToRelative(0.186f, -1.048f, -0.55f, -2.1f, -1.665f, -2.31f)
                moveToRelative(0f, 0f)
                quadToRelative(0.045f, 0.037f, 0f, 0f)
                moveTo(6f, 19f)
                horizontalLineToRelative(12f)
            }
        }.build()

        return _SiLanding!!
    }

@Suppress("ObjectPropertyName")
private var _SiLanding: ImageVector? = null
