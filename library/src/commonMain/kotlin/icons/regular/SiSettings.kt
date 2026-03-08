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

val Sargam.Regular.SiSettings: ImageVector
    get() {
        if (_SiSettings != null) {
            return _SiSettings!!
        }
        _SiSettings = ImageVector.Builder(
            name = "Regular.SiSettings",
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
                    moveTo(21f, 10f)
                    horizontalLineToRelative(-2.29f)
                    arcToRelative(7.454f, 7.454f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.54f, -1.32f)
                    lineToRelative(1.62f, -1.62f)
                    curveToRelative(0.78f, -0.78f, 0.78f, -2.05f, 0f, -2.83f)
                    reflectiveCurveToRelative(-2.05f, -0.78f, -2.83f, 0f)
                    lineToRelative(-1.62f, 1.62f)
                    curveToRelative(-0.21f, -0.11f, -0.42f, -0.21f, -0.64f, -0.3f)
                    horizontalLineToRelative(-0.01f)
                    curveToRelative(-0.22f, -0.09f, -0.44f, -0.17f, -0.67f, -0.24f)
                    verticalLineTo(3f)
                    curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                    reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                    verticalLineToRelative(2.29f)
                    curveToRelative(-0.23f, 0.07f, -0.45f, 0.15f, -0.67f, 0.24f)
                    horizontalLineToRelative(-0.01f)
                    curveToRelative(-0.22f, 0.09f, -0.43f, 0.19f, -0.64f, 0.3f)
                    lineTo(7.08f, 4.21f)
                    curveToRelative(-0.78f, -0.78f, -2.05f, -0.78f, -2.83f, 0f)
                    reflectiveCurveToRelative(-0.78f, 2.05f, 0f, 2.83f)
                    lineToRelative(1.62f, 1.62f)
                    arcToRelative(7.5f, 7.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.54f, 1.32f)
                    horizontalLineTo(3f)
                    curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                    reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(2.29f)
                    curveToRelative(0.07f, 0.23f, 0.15f, 0.46f, 0.24f, 0.68f)
                    reflectiveCurveToRelative(0.19f, 0.44f, 0.31f, 0.65f)
                    lineToRelative(-1.62f, 1.62f)
                    curveToRelative(-0.78f, 0.78f, -0.78f, 2.05f, 0f, 2.83f)
                    reflectiveCurveToRelative(2.05f, 0.78f, 2.83f, 0f)
                    lineToRelative(1.62f, -1.62f)
                    curveToRelative(0.21f, 0.11f, 0.43f, 0.21f, 0.65f, 0.31f)
                    curveToRelative(0.22f, 0.09f, 0.45f, 0.17f, 0.68f, 0.24f)
                    verticalLineToRelative(2.29f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                    verticalLineToRelative(-2.29f)
                    curveToRelative(0.23f, -0.07f, 0.46f, -0.15f, 0.68f, -0.24f)
                    reflectiveCurveToRelative(0.44f, -0.19f, 0.65f, -0.31f)
                    lineToRelative(1.62f, 1.62f)
                    curveToRelative(0.78f, 0.78f, 2.05f, 0.78f, 2.83f, 0f)
                    reflectiveCurveToRelative(0.78f, -2.05f, 0f, -2.83f)
                    lineToRelative(-1.62f, -1.62f)
                    curveToRelative(0.11f, -0.21f, 0.21f, -0.43f, 0.31f, -0.65f)
                    curveToRelative(0.09f, -0.22f, 0.17f, -0.45f, 0.24f, -0.68f)
                    horizontalLineTo(21f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
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

        return _SiSettings!!
    }

@Suppress("ObjectPropertyName")
private var _SiSettings: ImageVector? = null
