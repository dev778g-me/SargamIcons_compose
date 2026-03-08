package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathData
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiSettingsCute: ImageVector
    get() {
        if (_SiSettingsCute != null) {
            return _SiSettingsCute!!
        }
        _SiSettingsCute = ImageVector.Builder(
            name = "Regular.SiSettingsCute",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group(
                clipPathData = PathData {
                    moveTo(0f, 0f)
                    horizontalLineToRelative(24f)
                    verticalLineToRelative(24f)
                    horizontalLineTo(0f)
                    close()
                }
            ) {
                path(
                    stroke = SolidColor(Color.Black),
                    strokeLineWidth = 1.5f,
                    strokeLineJoin = StrokeJoin.Round
                ) {
                    moveTo(23f, 12f)
                    curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                    horizontalLineToRelative(-0.76f)
                    lineToRelative(0.54f, -0.54f)
                    arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -4.24f)
                    arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.24f, 0f)
                    lineToRelative(-0.54f, 0.54f)
                    verticalLineTo(4f)
                    curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                    reflectiveCurveTo(9f, 2.34f, 9f, 4f)
                    verticalLineToRelative(0.76f)
                    lineToRelative(-0.54f, -0.54f)
                    arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.24f, 0f)
                    arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4.24f)
                    lineToRelative(0.54f, 0.54f)
                    horizontalLineTo(4f)
                    curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                    reflectiveCurveToRelative(1.34f, 3f, 3f, 3f)
                    horizontalLineToRelative(0.76f)
                    lineToRelative(-0.54f, 0.54f)
                    arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4.24f)
                    arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.24f, 0f)
                    lineToRelative(0.54f, -0.54f)
                    verticalLineTo(20f)
                    curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                    reflectiveCurveToRelative(3f, -1.34f, 3f, -3f)
                    verticalLineToRelative(-0.76f)
                    lineToRelative(0.54f, 0.54f)
                    arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.24f, 0f)
                    arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -4.24f)
                    lineToRelative(-0.54f, -0.54f)
                    horizontalLineTo(20f)
                    curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                    close()
                }
                path(
                    stroke = SolidColor(Color.Black),
                    strokeLineWidth = 1.5f,
                    strokeLineJoin = StrokeJoin.Round
                ) {
                    moveTo(12f, 16f)
                    arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -8f)
                    arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 8f)
                    close()
                }
            }
        }.build()

        return _SiSettingsCute!!
    }

@Suppress("ObjectPropertyName")
private var _SiSettingsCute: ImageVector? = null
