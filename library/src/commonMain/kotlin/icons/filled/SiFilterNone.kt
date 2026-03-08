package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiFilterNone: ImageVector
    get() {
        if (_SiFilterNone != null) {
            return _SiFilterNone!!
        }
        _SiFilterNone = ImageVector.Builder(
            name = "Filled.SiFilterNone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.4f, 2f)
                horizontalLineToRelative(11.2f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 4.4f)
                verticalLineToRelative(11.2f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.4f, 2.4f)
                horizontalLineTo(8.4f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 15.6f)
                verticalLineTo(4.4f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.4f, 2f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                verticalLineToRelative(11.6f)
                curveTo(2f, 19.132f, 4.868f, 22f, 8.4f, 22f)
                horizontalLineTo(20f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -2f)
                horizontalLineTo(8.4f)
                arcTo(4.403f, 4.403f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 15.6f)
                close()
            }
        }.build()

        return _SiFilterNone!!
    }

@Suppress("ObjectPropertyName")
private var _SiFilterNone: ImageVector? = null
