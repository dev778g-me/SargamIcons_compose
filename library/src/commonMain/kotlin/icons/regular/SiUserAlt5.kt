package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiUserAlt5: ImageVector
    get() {
        if (_SiUserAlt5 != null) {
            return _SiUserAlt5!!
        }
        _SiUserAlt5 = ImageVector.Builder(
            name = "Regular.SiUserAlt5",
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
                moveTo(20.4f, 22f)
                horizontalLineToRelative(-0.02f)
                moveToRelative(0f, 0f)
                horizontalLineTo(3.6f)
                curveToRelative(-0.88f, 0f, -1.6f, -0.72f, -1.6f, -1.6f)
                verticalLineToRelative(-3.65f)
                curveToRelative(0f, -0.25f, 0f, -0.38f, 0.12f, -0.62f)
                curveToRelative(0.38f, -0.88f, 1.5f, -1.62f, 3.25f, -2.25f)
                moveTo(20.38f, 22f)
                curveToRelative(0.88f, 0f, 1.6f, -0.72f, 1.6f, -1.6f)
                verticalLineToRelative(-3.65f)
                curveToRelative(0f, -0.24f, 0f, -0.5f, -0.12f, -0.62f)
                curveToRelative(-0.37f, -0.87f, -1.5f, -1.63f, -3.25f, -2.25f)
                moveTo(12f, 13.5f)
                curveToRelative(-2.75f, 0f, -5f, -2.25f, -5f, -5f)
                verticalLineTo(7f)
                curveToRelative(0f, -2.75f, 2.25f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.25f, 5f, 5f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 2.75f, -2.25f, 5f, -5f, 5f)
            }
        }.build()

        return _SiUserAlt5!!
    }

@Suppress("ObjectPropertyName")
private var _SiUserAlt5: ImageVector? = null
