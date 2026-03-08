package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiSettingsApplications: ImageVector
    get() {
        if (_SiSettingsApplications != null) {
            return _SiSettingsApplications!!
        }
        _SiSettingsApplications = ImageVector.Builder(
            name = "Filled.SiSettingsApplications",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 12f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -4f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 0f)
            }
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(20.067f, 1f)
                horizontalLineTo(3.933f)
                arcTo(2.933f, 2.933f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 3.933f)
                verticalLineToRelative(16.134f)
                arcTo(2.933f, 2.933f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.933f, 23f)
                horizontalLineToRelative(16.134f)
                arcTo(2.933f, 2.933f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 20.067f)
                verticalLineTo(3.933f)
                arcTo(2.933f, 2.933f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.067f, 1f)
                moveTo(18.5f, 10.5f)
                horizontalLineToRelative(-1.75f)
                curveToRelative(-0.09f, -0.28f, -0.2f, -0.54f, -0.33f, -0.8f)
                lineToRelative(1.24f, -1.24f)
                curveToRelative(0.59f, -0.59f, 0.59f, -1.54f, 0f, -2.12f)
                reflectiveCurveToRelative(-1.54f, -0.59f, -2.12f, 0f)
                lineTo(14.3f, 7.58f)
                curveToRelative(-0.25f, -0.13f, -0.52f, -0.24f, -0.8f, -0.33f)
                verticalLineTo(5.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(1.75f)
                curveToRelative(-0.28f, 0.09f, -0.54f, 0.2f, -0.8f, 0.33f)
                lineTo(8.46f, 6.34f)
                arcToRelative(1.49f, 1.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.12f, 0f)
                curveToRelative(-0.58f, 0.59f, -0.59f, 1.54f, 0f, 2.12f)
                lineTo(7.58f, 9.7f)
                curveToRelative(-0.13f, 0.25f, -0.24f, 0.52f, -0.33f, 0.8f)
                horizontalLineTo(5.5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(1.75f)
                curveToRelative(0.09f, 0.28f, 0.2f, 0.54f, 0.33f, 0.8f)
                lineToRelative(-1.24f, 1.24f)
                arcToRelative(1.49f, 1.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2.12f)
                curveToRelative(0.59f, 0.59f, 1.54f, 0.59f, 2.12f, 0f)
                lineToRelative(1.24f, -1.24f)
                curveToRelative(0.25f, 0.13f, 0.52f, 0.24f, 0.8f, 0.33f)
                verticalLineToRelative(1.75f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-1.75f)
                curveToRelative(0.28f, -0.09f, 0.54f, -0.2f, 0.8f, -0.33f)
                lineToRelative(1.24f, 1.24f)
                curveToRelative(0.59f, 0.59f, 1.54f, 0.59f, 2.12f, 0f)
                curveToRelative(0.59f, -0.59f, 0.59f, -1.54f, 0f, -2.12f)
                lineToRelative(-1.24f, -1.24f)
                curveToRelative(0.13f, -0.25f, 0.24f, -0.52f, 0.33f, -0.8f)
                horizontalLineToRelative(1.75f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            }
        }.build()

        return _SiSettingsApplications!!
    }

@Suppress("ObjectPropertyName")
private var _SiSettingsApplications: ImageVector? = null
