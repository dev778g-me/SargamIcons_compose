package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiFlagAlt1: ImageVector
    get() {
        if (_SiFlagAlt1 != null) {
            return _SiFlagAlt1!!
        }
        _SiFlagAlt1 = ImageVector.Builder(
            name = "Filled.SiFlagAlt1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 10.702f)
                curveTo(22f, 12.56f, 20.43f, 14f, 18.6f, 14f)
                horizontalLineTo(4.2f)
                quadToRelative(-0.1f, -0.001f, -0.2f, -0.01f)
                verticalLineTo(20f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
                verticalLineTo(6.298f)
                curveTo(2f, 4.44f, 3.57f, 3f, 5.4f, 3f)
                horizontalLineToRelative(14.4f)
                curveToRelative(1.17f, 0f, 2.2f, 0.925f, 2.2f, 2.15f)
                close()
            }
        }.build()

        return _SiFlagAlt1!!
    }

@Suppress("ObjectPropertyName")
private var _SiFlagAlt1: ImageVector? = null
