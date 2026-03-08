package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiGlobeDetailed: ImageVector
    get() {
        if (_SiGlobeDetailed != null) {
            return _SiGlobeDetailed!!
        }
        _SiGlobeDetailed = ImageVector.Builder(
            name = "Filled.SiGlobeDetailed",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.973f, 11f)
                arcToRelative(15f, 15f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.323f, -2.321f)
                curveTo(13.802f, 8.889f, 12.914f, 9f, 12f, 9f)
                curveToRelative(-0.907f, 0f, -1.787f, -0.11f, -2.629f, -0.316f)
                arcTo(15f, 15f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.033f, 11f)
                close()
                moveTo(9.033f, 13f)
                quadToRelative(0.08f, 1.186f, 0.336f, 2.317f)
                arcTo(11f, 11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 15f)
                curveToRelative(0.9f, 0f, 1.773f, 0.108f, 2.609f, 0.312f)
                quadToRelative(0.264f, -1.131f, 0.351f, -2.312f)
                close()
                moveTo(14.025f, 17.229f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 17f)
                curveToRelative(-0.709f, 0f, -1.398f, 0.082f, -2.059f, 0.236f)
                curveToRelative(0.5f, 1.34f, 1.185f, 2.589f, 2.025f, 3.716f)
                arcToRelative(15f, 15f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.059f, -3.723f)
            }
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(22f, 12f)
                curveToRelative(0f, 5.523f, -4.477f, 10f, -10f, 10f)
                reflectiveCurveTo(2f, 17.523f, 2f, 12f)
                reflectiveCurveTo(6.477f, 2f, 12f, 2f)
                reflectiveCurveToRelative(10f, 4.477f, 10f, 10f)
                moveTo(12f, 3f)
                curveToRelative(-0.927f, 0f, -1.822f, 0.14f, -2.664f, 0.4f)
                curveToRelative(-0.5f, 0.854f, -0.928f, 1.755f, -1.276f, 2.693f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.716f, -1.094f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.411f, 1.428f)
                arcTo(11f, 11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.47f, 8.026f)
                curveTo(7.24f, 8.992f, 7.09f, 9.986f, 7.03f, 11f)
                horizontalLineTo(3.055f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                horizontalLineToRelative(3.974f)
                quadToRelative(0.091f, 1.528f, 0.44f, 2.974f)
                curveToRelative(-0.922f, 0.416f, -1.774f, 0.956f, -2.537f, 1.598f)
                curveToRelative(0.415f, 0.527f, 0.889f, 1.006f, 1.41f, 1.428f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.715f, -1.093f)
                curveToRelative(0.348f, 0.94f, 0.777f, 1.84f, 1.278f, 2.692f)
                curveToRelative(0.842f, 0.26f, 1.737f, 0.401f, 2.665f, 0.401f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.599f, -0.38f)
                arcToRelative(17f, 17f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.313f, -2.727f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.744f, 1.108f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.411f, -1.428f)
                curveToRelative(-0.77f, -0.646f, -1.63f, -1.19f, -2.558f, -1.608f)
                curveToRelative(0.237f, -0.962f, 0.391f, -1.954f, 0.456f, -2.965f)
                horizontalLineToRelative(3.98f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                horizontalLineToRelative(-3.969f)
                arcToRelative(17f, 17f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.425f, -2.983f)
                curveToRelative(0.913f, -0.415f, 1.76f, -0.952f, 2.518f, -1.589f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.657f, 5f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.685f, 1.08f)
                arcToRelative(17f, 17f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.243f, -2.659f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.664f, -0.42f)
                arcToRelative(15f, 15f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.025f, 3.756f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.146f, 0.007f)
                arcTo(15f, 15f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.003f, 3f)
                close()
            }
        }.build()

        return _SiGlobeDetailed!!
    }

@Suppress("ObjectPropertyName")
private var _SiGlobeDetailed: ImageVector? = null
