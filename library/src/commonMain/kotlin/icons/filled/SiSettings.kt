package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiSettings: ImageVector
    get() {
        if (_SiSettings != null) {
            return _SiSettings!!
        }
        _SiSettings = ImageVector.Builder(
            name = "Filled.SiSettings",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12.02f, 1f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(2.31f)
                curveToRelative(0.23f, 0.07f, 0.45f, 0.15f, 0.67f, 0.24f)
                horizontalLineToRelative(0.01f)
                curveToRelative(0.22f, 0.09f, 0.43f, 0.19f, 0.64f, 0.3f)
                lineToRelative(1.62f, -1.62f)
                curveToRelative(0.78f, -0.78f, 2.05f, -0.78f, 2.83f, 0f)
                reflectiveCurveToRelative(0.78f, 2.05f, 0f, 2.83f)
                lineToRelative(-1.62f, 1.62f)
                arcToRelative(7.5f, 7.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.54f, 1.32f)
                horizontalLineTo(21f)
                verticalLineToRelative(-0.02f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-2.29f)
                curveToRelative(-0.07f, 0.23f, -0.15f, 0.46f, -0.24f, 0.68f)
                curveToRelative(-0.1f, 0.22f, -0.2f, 0.44f, -0.31f, 0.65f)
                lineToRelative(1.62f, 1.62f)
                curveToRelative(0.78f, 0.78f, 0.78f, 2.05f, 0f, 2.83f)
                reflectiveCurveToRelative(-2.05f, 0.78f, -2.83f, 0f)
                lineToRelative(-1.62f, -1.62f)
                curveToRelative(-0.21f, 0.12f, -0.43f, 0.22f, -0.65f, 0.31f)
                reflectiveCurveToRelative(-0.45f, 0.17f, -0.68f, 0.24f)
                verticalLineToRelative(2.29f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-2.29f)
                curveToRelative(-0.23f, -0.07f, -0.46f, -0.15f, -0.68f, -0.24f)
                curveToRelative(-0.22f, -0.1f, -0.44f, -0.2f, -0.65f, -0.31f)
                lineToRelative(-1.62f, 1.62f)
                curveToRelative(-0.78f, 0.78f, -2.05f, 0.78f, -2.83f, 0f)
                reflectiveCurveToRelative(-0.78f, -2.05f, 0f, -2.83f)
                lineToRelative(1.62f, -1.62f)
                curveToRelative(-0.12f, -0.21f, -0.22f, -0.43f, -0.31f, -0.65f)
                reflectiveCurveToRelative(-0.17f, -0.45f, -0.24f, -0.68f)
                horizontalLineTo(3f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(2.33f)
                arcToRelative(7.453f, 7.453f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.54f, -1.32f)
                lineTo(4.25f, 7.04f)
                curveToRelative(-0.78f, -0.78f, -0.78f, -2.05f, 0f, -2.83f)
                reflectiveCurveToRelative(2.05f, -0.78f, 2.83f, 0f)
                lineTo(8.7f, 5.83f)
                curveToRelative(0.21f, -0.11f, 0.42f, -0.21f, 0.64f, -0.3f)
                horizontalLineToRelative(0.01f)
                curveToRelative(0.22f, -0.09f, 0.44f, -0.17f, 0.67f, -0.24f)
                verticalLineTo(3f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                moveTo(12f, 8f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 8f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -8f)
            }
        }.build()

        return _SiSettings!!
    }

@Suppress("ObjectPropertyName")
private var _SiSettings: ImageVector? = null
