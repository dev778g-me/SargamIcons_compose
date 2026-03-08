package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiDashboardCustomize: ImageVector
    get() {
        if (_SiDashboardCustomize != null) {
            return _SiDashboardCustomize!!
        }
        _SiDashboardCustomize = ImageVector.Builder(
            name = "Duotone.SiDashboardCustomize",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.16f
            ) {
                moveTo(8.4f, 14f)
                horizontalLineTo(5.6f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 15.6f)
                verticalLineToRelative(2.8f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.6f, 20f)
                horizontalLineToRelative(2.8f)
                arcToRelative(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.6f, -1.6f)
                verticalLineToRelative(-2.8f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.4f, 14f)
                moveTo(18.4f, 4f)
                horizontalLineToRelative(-2.8f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 5.6f)
                verticalLineToRelative(2.8f)
                arcToRelative(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.6f, 1.6f)
                horizontalLineToRelative(2.8f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 8.4f)
                verticalLineTo(5.6f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.4f, 4f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 17f)
                horizontalLineToRelative(6f)
                moveToRelative(-3f, 3f)
                verticalLineToRelative(-6f)
                moveTo(5.6f, 4f)
                horizontalLineToRelative(2.8f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 5.6f)
                verticalLineToRelative(2.8f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.4f, 10f)
                horizontalLineTo(5.6f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 8.4f)
                verticalLineTo(5.6f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.6f, 4f)
                moveToRelative(0f, 10f)
                horizontalLineToRelative(2.8f)
                arcToRelative(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.6f, 1.6f)
                verticalLineToRelative(2.8f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.4f, 20f)
                horizontalLineTo(5.6f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 18.4f)
                verticalLineToRelative(-2.8f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.6f, 14f)
                moveToRelative(10f, -10f)
                horizontalLineToRelative(2.8f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 5.6f)
                verticalLineToRelative(2.8f)
                arcToRelative(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.6f, 1.6f)
                horizontalLineToRelative(-2.8f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 8.4f)
                verticalLineTo(5.6f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.6f, 4f)
            }
        }.build()

        return _SiDashboardCustomize!!
    }

@Suppress("ObjectPropertyName")
private var _SiDashboardCustomize: ImageVector? = null
